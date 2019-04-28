package com.cc.open.config;

import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CORSConfig {

	private static Logger logger = LoggerFactory.getLogger(CORSConfig.class);
	
	@Autowired
	private LoginInterceptor loginInterceptor;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                if (logger.isInfoEnabled()) {
                	logger.info("初始化 CORSConfiguration 配置");
                }
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .allowedOrigins("*")
                        .allowCredentials(true);
            }
            
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//            	registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/user/login");
//            	
//            }
        };
    }
}
