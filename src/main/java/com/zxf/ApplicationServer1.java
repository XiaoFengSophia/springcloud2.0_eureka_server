package com.zxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//Eureka服务
public class ApplicationServer1 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer1.class, args);
		System.out.println("Eureka服务机—1号已启动！！");
	}

}
