package com.github.springfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
@Import({ SpringDataRestConfiguration.class })
public class SpringfoxSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringfoxSampleApplication.class, args);
	}
}
