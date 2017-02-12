package com.niket.springWeb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.niket.springWeb.entity.Offer;

@Component
public class OffersDao {
	
	JdbcTemplate dataSource ;
	public OffersDao(){
		System.out.println(" HEllo Offers DAo");
	}
	
	
	public JdbcTemplate getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = new JdbcTemplate(dataSource);
		
	} 
	
	
	public List<Offer> getAllOffers(){
		
		return dataSource.query("select * from offers", new RowMapper<Offer >(){

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer o = new Offer();
				o.setId(rs.getInt(1));
				o.setName(rs.getString(2));
				o.setValue(rs.getString(3));
				// TODO Auto-generated method stub
				return o;
			}
		});
	}
	
	

}
