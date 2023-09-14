package com.ewghrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewghrm.entity.User;
import com.ewghrm.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public User creteUser(@RequestBody User user) {

		User creaUser = this.userService.creaUser(user);
		return creaUser;
	}
	
	@GetMapping("/getall")
	public List<User> getAlluser(){
		
		List<User> allUser = this.userService.getAllUser();
		return allUser;
	}
	
	@GetMapping("/singleUser/{id}")
	public User getSingleUser(@PathVariable int id) {
		
		User singleUser = this.userService.singleUser(id);
		
		return singleUser;
	}
}
