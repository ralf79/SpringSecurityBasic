package com.hw.sec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hw.sec.domain.Employee;
import com.hw.sec.service.BoardService;

@Service
public class LoginUserDetailsService implements UserDetailsService{

	@Autowired
	BoardService userService;

//	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		Employee emp = userService.getUsers(name);
		
		return new LoginUserDetails(emp.getName(),emp.getPw(),AuthorityUtils.createAuthorityList(emp.getAuth()));
	}
	
//	public PasswordEncoder passwordEncoder() { 
//		return this.passwordEncoder; 
//	}
	
}
