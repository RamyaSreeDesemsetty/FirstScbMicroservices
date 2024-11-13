package com.cg.FirstScbMicroservices.services;

import java.util.List;

import com.cg.FirstScbMicroservices.entities.User;

public interface UserService {
	public User createUser(User user);

	public List<User> getAllUsers();

	public User getUserById(Long uid);

}
