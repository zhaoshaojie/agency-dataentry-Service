package com.announce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.announce.dataentry.operation.mapper")
public class AnnounceDataEntryApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnnounceDataEntryApplication.class, args);
	}

}
