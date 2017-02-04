package com.niket.springWeb.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OffersDao {
	
	JdbcTemplate dataSource ;
	public OffersDao(){
		System.out.println(" HEllo Offers DAo");
	}
	
	
	public JdbcTemplate getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = new JdbcTemplate(dataSource);
	} 
	
	
	

}
