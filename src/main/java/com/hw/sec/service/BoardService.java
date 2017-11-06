package com.hw.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hw.sec.domain.EmpRepository;
import com.hw.sec.domain.Employee;

@Component
public class BoardService {

	@Autowired
	EmpRepository er;
	
	public List<Employee> getList(){
		return er.findAll();
	}
}
