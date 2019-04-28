package com.huanggz.spring_boot_hello.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.huanggz.spring_boot_hello.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{

}
