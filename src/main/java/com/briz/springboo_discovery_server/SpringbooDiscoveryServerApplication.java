package com.briz.springboo_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringbooDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooDiscoveryServerApplication.class, args);
	}

}
