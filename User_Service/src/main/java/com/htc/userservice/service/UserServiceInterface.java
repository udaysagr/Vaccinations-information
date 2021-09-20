package com.htc.userservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userservice.entity.UserService;

public interface UserServiceInterface  extends JpaRepository<UserService, Long>{
	
	

}
