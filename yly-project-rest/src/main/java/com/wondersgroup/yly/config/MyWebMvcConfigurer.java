package com.wondersgroup.yly.config;

import com.mseap.framework.mvc.context.binding.SessionContextHandlerInterceptor;
import com.mseap.framework.mvc.context.binding.ThreadContextHandlerInterceptor;
import com.mseap.framework.mvc.context.transport.HttpTransportContextHandlerInterceptor;
import com.mseap.framework.mvc.context.transport.HttpTransportContextProvider;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

//@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

	@Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

	}

	@Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

	}

	@Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		// TODO Auto-generated method stub

	}

	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ThreadContextHandlerInterceptor());
		registry.addInterceptor(new HttpTransportContextHandlerInterceptor(new HttpTransportContextProvider()));
		registry.addInterceptor(new SessionContextHandlerInterceptor());
	}

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub

	}

	@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		// TODO Auto-generated method stub

	}

	@Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
		// TODO Auto-generated method stub

	}

	@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub

	}

	@Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub

	}

	@Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		// TODO Auto-generated method stub

	}

	@Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		// TODO Auto-generated method stub

	}

	@Override
    public Validator getValidator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public MessageCodesResolver getMessageCodesResolver() {
		// TODO Auto-generated method stub
		return null;
	}

}
