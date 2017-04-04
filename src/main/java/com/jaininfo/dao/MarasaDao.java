package com.jaininfo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jaininfo.model.Marasa;

@Repository
public class MarasaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Marasa> getMarasaInfo(String id) {

		return jdbcTemplate.query("select * from marasa", new MarasaRowMapper());
	}
	
	class MarasaRowMapper implements RowMapper<Marasa>
	{
	    @Override
	    public Marasa mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Marasa marasa = new Marasa();
	    	marasa.setId(rs.getString("id"));
	        marasa.setName(rs.getString("name"));
	        marasa.setLocation(rs.getString("location"));
	        marasa.setContactPersonName(rs.getString("contactPersonName"));
	        marasa.setContactPersonPhone(rs.getString("contactPersonPhone"));
	        return marasa;
	    }
	}

}
