package com.shoposphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoposphereEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoposphereEurekaServerApplication.class, args);
	}

}
