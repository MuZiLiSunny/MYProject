package com.wondersgroup.yly;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml", "classpath:provider.xml"})
public class ProviderApplication {
	private static final Logger logs = LogManager.getLogger(ProviderApplication.class);
//	private Logger logs = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
