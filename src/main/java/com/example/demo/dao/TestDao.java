package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int count() {
        String sql = "select count(*) from Users";
        return this.jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
