package com.SpringJdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements Dao{
	
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		String query = "insert into Student values(' "+student.getId()+" ',' "+student.getName()+" ' , ' "+student.getEmail()+" ' ,' "+student.getAddress()+" ' ,' "+student.getAge()+" ')";
		//return jdbcTemplate.update(query);		
		int result = this.jdbcTemplate.update(query);
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
}
