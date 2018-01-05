package com.helpe.imarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"com.helpe"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.helpe.imarket.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.helpe.imarket.entity") // 扫描实体类
@SpringBootApplication
public class ImarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImarketApplication.class, args);
	}
}
