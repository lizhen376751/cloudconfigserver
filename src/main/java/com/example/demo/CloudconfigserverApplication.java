package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableConfigServer注解开启配置服务器的功能
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class CloudconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigserverApplication.class, args);
	}
}
