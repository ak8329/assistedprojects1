
package com.demo;
	

	

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.ComponentScan;
	

	@SpringBootApplication
	@ComponentScan("com.bean")
	public class Test {
	

		public static void main(String[] args) {
			SpringApplication.run(Test.class, args);
			System.out.println("hello");
		}
	

	}

