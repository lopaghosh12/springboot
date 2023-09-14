package com.ewghrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewghrm.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
