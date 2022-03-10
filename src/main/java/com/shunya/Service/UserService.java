package com.shunya.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shunya.tdl.Entity.User;

@Service
public interface UserService {
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserByID(Long id);
	
	User updateUser(User user);
	
	void deleteUserById(User id);
}
