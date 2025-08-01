package com.burakejder.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.burakejder"}) // entity görmesi için
@SpringBootApplication
@ComponentScan(basePackages = {"com.burakejder"}) // rest controller vs bean leri tanısın
@EnableJpaRepositories(basePackages = {"com.burakejder"})
// @PropertySource(value = "classpath:application.properties") // bunun sayesinde ismi değişmiş şekilde uyguluma yağa kaldkı
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
