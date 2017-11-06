package com.hw.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.hw.sec.domain.EmpRepository;
import com.hw.sec.domain.Employee;

@Component
public class ServerInitializer implements ApplicationRunner {

	@Autowired
	EmpRepository er;
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        //code goes here
		System.out.println("========================ServerInitializer start===================");
		er.save(new Employee("ralf79", 39, "pw"));
		er.save(new Employee("ralf78", 40, "pw"));


		
    }
}