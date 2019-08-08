package com.wondersgroup.yly;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan({ "com.mseap.framework", "com.wondersgroup.yly" })
@SpringBootApplication
@EnableDubboConfiguration
@ImportResource(locations = { "classpath:applicationContext.xml" })
public class ConsumerApplication {
	public static void main(String[] args) {

		SpringApplication.run(ConsumerApplication.class, args);
	}
}
