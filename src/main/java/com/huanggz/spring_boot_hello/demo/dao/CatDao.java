package com.huanggz.spring_boot_hello.demo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.huanggz.spring_boot_hello.demo.bean.Cat;

@Repository
public class CatDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Cat getByCatName(String catName) {
		String sql = "select * from cat where cat_name=?";
		System.out.println(sql);
		System.out.println(catName);
		RowMapper rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		Cat cat = (Cat) jdbcTemplate.queryForObject(sql, new Object[] {catName}, rowMapper);
		return cat;
	}
}
