package com.wondersgroup.yly.config;

import com.mseap.framework.context.application.DefaultApplicationInfo;
import com.mseap.framework.mvc.context.binding.SessionContextHandlerInterceptor;
import com.mseap.framework.mvc.context.binding.ThreadContextHandlerInterceptor;
import com.mseap.framework.mvc.context.binding.WebApplicationContextBinder;
import com.mseap.framework.mvc.context.transport.HttpTransportContextHandlerInterceptor;
import com.mseap.framework.mvc.context.transport.HttpTransportContextProvider;
import com.mseap.framework.mvc.error.FrameworkErrorController;
import com.mseap.framework.mvc.error.FrameworkHandlerExceptionResolver;
import org.hibernate.validator.HibernateValidator;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@EnableSwagger2
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @ConfigurationProperties(prefix = "mseaf.application")
    public DefaultApplicationInfo applicationInfo() {
        return new DefaultApplicationInfo();
    }

    @Bean
    public WebApplicationContextBinder webApplicationContextBinder() {
        return new WebApplicationContextBinder();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ThreadContextHandlerInterceptor());
        registry.addInterceptor(new HttpTransportContextHandlerInterceptor(new HttpTransportContextProvider()));
        registry.addInterceptor(new SessionContextHandlerInterceptor());

        super.addInterceptors(registry);
    }

    @Bean
    public FrameworkHandlerExceptionResolver frameworkHandlerExceptionResolver() {
        // FrameworkExceptionErrorDescriptionConverter
        // MessageSource
        FrameworkHandlerExceptionResolver resolver = new FrameworkHandlerExceptionResolver();
        // resolver.setBasePathOfErrorView("errors/");
        // resolver.setStackTraceRenderer(new HtmlStackTraceRenderer());
        return resolver;
    }

    @Bean
    public FrameworkErrorController frameworkErrorController(ErrorAttributes errorAttributes) {
        return new FrameworkErrorController(errorAttributes);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/index.html");
    }

    @Bean
    public Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class).configure()
                .addProperty("hibernate.validator.fail_fast", "true") // 为true时代表快速失败模式，false则为全部校验后再结束。
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        return validator;
    }

    @Bean
    public Docket createRestApi(Environment env) {
        System.out.println(MvcConfig.class.getPackage().getName());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(env.getProperty("spring.application.name"))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wondersgroup.com.wondersgroup.yly"))
                .paths(PathSelectors.any()).build();
    }
    private static final String VERSION = "1.0.0";
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("医疗中心 REST APIs")
                .contact(new Contact("万达信息养老云", "http://ylcloud.wondersgroup.com", "ylcloud@wondersgroup.com"))
                .version(VERSION).build();
    }

}
