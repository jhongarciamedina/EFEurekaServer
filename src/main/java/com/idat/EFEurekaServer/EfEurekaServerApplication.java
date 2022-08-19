package com.idat.EFEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfEurekaServerApplication.class, args);
	}

}
