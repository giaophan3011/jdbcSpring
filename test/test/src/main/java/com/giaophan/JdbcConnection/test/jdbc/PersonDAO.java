package com.giaophan.JdbcConnection.test.jdbc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.giaophan.JdbcConnection.test.bean.Person;
@Repository
public class PersonDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Person> getAllPerson() {
		
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person> (Person.class));
	}
	public Person getPersonById(int id) {
		Person person = jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id}, new BeanPropertyRowMapper <Person>(Person.class));
		System.out.println(person.getName());
		return person;
		
		
	}
	public int deletePersonById(String name) {
		int howManyRowDeleted = jdbcTemplate.update("delete from person where name=?", new Object[] {name});
	
		return howManyRowDeleted;

}
}
