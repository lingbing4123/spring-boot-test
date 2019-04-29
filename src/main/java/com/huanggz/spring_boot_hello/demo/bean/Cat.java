package com.huanggz.spring_boot_hello.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String catName;
	private int age;
	public int getId() {
		return id;
	}
	public String getCatName() {
		return catName;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
