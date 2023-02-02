package com.rk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rk.dao.MovieDao;

@SpringBootApplication
public class TwelveFactorApplication implements CommandLineRunner{
	
	@Autowired
    MovieDao movieDao;

	public static void main(String[] args) {
		SpringApplication.run(TwelveFactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		movieDao.createTable();
		System.out.println("Done");
		
	}

}
