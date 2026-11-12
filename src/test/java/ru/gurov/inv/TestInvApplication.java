package ru.gurov.inv;

import org.springframework.boot.SpringApplication;

public class TestInvApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
