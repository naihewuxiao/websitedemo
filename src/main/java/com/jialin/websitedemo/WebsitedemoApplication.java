package com.jialin.websitedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan("com.jialin.websitedemo.mapper")
@ServletComponentScan
public class WebsitedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsitedemoApplication.class, args);
	}

}
