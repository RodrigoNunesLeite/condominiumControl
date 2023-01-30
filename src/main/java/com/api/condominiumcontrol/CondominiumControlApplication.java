package com.api.condominiumcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/* Aciona a auditoria do Spring Data JPA*/
@EnableJpaAuditing
public class CondominiumControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondominiumControlApplication.class, args);
	}
	
}
