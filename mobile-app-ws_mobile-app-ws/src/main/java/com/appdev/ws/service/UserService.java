package com.appdev.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appdev.ws.shared.dto.UserDto;


public interface UserService extends UserDetailsService{
	
	UserDto createUser(UserDto user);
	
	 // 7.6

}
