package com.hw.sec.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);
	
}
