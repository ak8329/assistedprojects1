package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com")
public class Myconfig {
	@Bean(name="pp")
public Product getInstance() {
	Product pp =new Product();
	return pp;
}
}
