package com.cc.open;

import javax.servlet.MultipartConfigElement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.cc.open.dao")
@ComponentScan("com.cc.open")
@Configuration
//@ServletComponentScan("com.cc.open.filter")
public class OpenCoursesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCoursesServiceApplication.class, args);
	}
	
	/**
	 * 配置上传文件大小的配置
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
	   MultipartConfigFactory factory = new MultipartConfigFactory();
	   //  单个数据大小
	   factory.setMaxFileSize("1024000KB");
	   /// 总上传数据大小
	   factory.setMaxRequestSize("1024000KB");
	   return factory.createMultipartConfig();
	}

}
