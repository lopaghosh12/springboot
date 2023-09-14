package com.ewghrm.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewghrm.entity.User;
import com.ewghrm.repo.UserRepo;
import com.ewghrm.service.UserService;

@Service
public class UserServiceImp implements UserService{

	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User creaUser(User user) {
		
		User save = this.userRepo.save(user);
		
		return save;
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> findAll = this.userRepo.findAll();
		
		return findAll;
	}

	@Override
	public User singleUser(int id) {
		
		User user = this.userRepo.findById(id).get();
		
		return user;
	}

}
