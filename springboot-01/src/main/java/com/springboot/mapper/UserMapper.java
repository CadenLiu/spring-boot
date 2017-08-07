package com.springboot.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.pojo.User;

public interface UserMapper {

	public List<User> query();
	
}
