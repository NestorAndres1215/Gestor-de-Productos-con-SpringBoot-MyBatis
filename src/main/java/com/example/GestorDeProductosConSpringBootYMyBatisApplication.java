package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")  // Ajusta el paquete según tu proyecto
public class GestorDeProductosConSpringBootYMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorDeProductosConSpringBootYMyBatisApplication.class, args);
	}

}
