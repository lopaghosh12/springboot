package com.ewghrm.service;

import java.util.List;

import com.ewghrm.entity.User;

public interface UserService {
	
	User creaUser(User user);
	
	List<User> getAllUser();
	
	User singleUser(int id);
}
