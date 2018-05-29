package com.gzuni.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.gzuni.actuator.mapper.tk")
public class ActuatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}
}
