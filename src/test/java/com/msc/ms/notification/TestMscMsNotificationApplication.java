package com.msc.ms.notification;

import org.springframework.boot.SpringApplication;

public class TestMscMsNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.from(MscMsNotificationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
