package com.shunya.Service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shunya.Service.UserService;
import com.shunya.tdl.Entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	private UserService uService;
	
	public UserServiceImpl(UserService uService) {
		super();
		this.uService = uService;
	}

	@Override
	public List<User> getAllUsers() {
		return uService.getAllUsers();
	}

	@Override
	public User saveUser(User user) {
		return uService.saveUser(user);
	}

	@Override
	public User getUserByID(Long id) {
		return uService.getUserByID(id);
	}

	@Override
	public User updateUser(User user) {
		return uService.saveUser(user);
	}

	@Override
	public void deleteUserById(User id) {
		uService.deleteUserById(id);
	}

}
