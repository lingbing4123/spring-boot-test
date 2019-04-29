package com.huanggz.spring_boot_hello.demo.service;


import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.huanggz.spring_boot_hello.demo.bean.Cat;
import com.huanggz.spring_boot_hello.demo.dao.CatDao;
import com.huanggz.spring_boot_hello.demo.repository.Cat2Repository;
import com.huanggz.spring_boot_hello.demo.repository.CatRepository;

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;
	

	@Resource
	private Cat2Repository cat2Repository;
	
	@Resource
	private CatDao catDao;
	
	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}
	

	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName) {
		return catDao.getByCatName(catName);
	}
}
