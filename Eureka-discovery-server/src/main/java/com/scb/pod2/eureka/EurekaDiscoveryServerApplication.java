package com.scb.pod2.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.Generated;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryServerApplication {

	@Generated
	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
	}

}
