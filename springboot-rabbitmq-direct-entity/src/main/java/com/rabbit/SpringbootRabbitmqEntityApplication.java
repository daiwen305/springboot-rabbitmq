package com.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SpringbootRabbitmqEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqEntityApplication.class, args);
	}
	
	@Bean
	public Queue queue(){
		return new Queue("userQueue");
	}
}
