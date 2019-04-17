package com.cc.open;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cc.open.dao")
@ComponentScan(basePackages = {"com.cc.open"})
//@ServletComponentScan("com.cc.open.filter")
public class OpenCoursesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCoursesServiceApplication.class, args);
	}

}
