package com.rk.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.entity.Movie;

@Repository
public class MovieDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	public int createTable() {
		String query = "CREATE TABLE IF NOT EXISTS movie(id SERIAL, name varchar(200), year varchar(100))";
		return this.jdbcTemplate.update(query);
	}
	public int save(Movie movie) {
        return jdbcTemplate.update(
                "insert into movie (name, price) values(?,?)",
                movie.getName(), movie.getYear());
    }
	
	public List<Movie> findAll() {
        return jdbcTemplate.query(
                "select * from movie",
                (rs, rowNum) ->
                        new Movie(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("year")
                                
                        )
        );
    }
	
	

}
