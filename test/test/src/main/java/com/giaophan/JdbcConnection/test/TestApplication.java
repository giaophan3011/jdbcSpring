package com.giaophan.JdbcConnection.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.giaophan.JdbcConnection.test.jdbc.PersonDAO;

@SpringBootApplication
public class TestApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonDAO dao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception{
		logger.info("all user --> {}", dao.getAllPerson());
		logger.info("userbyid 1 --> {}", dao.getPersonById(2));
		System.out.println(dao.getPersonById(2));
		logger.info("deleted Row --> {}", dao.deletePersonById("Timi"));
	}
}
