package net.varun.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.varun.departmentservice.repository.DepartmentRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = DepartmentRepository.class)
@ComponentScan
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
