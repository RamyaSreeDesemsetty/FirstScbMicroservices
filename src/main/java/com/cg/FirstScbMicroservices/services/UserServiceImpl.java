package com.cg.FirstScbMicroservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.FirstScbMicroservices.entities.User;
import com.cg.FirstScbMicroservices.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository; // Assuming UserRepository for data access

	@Override
	public User createUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		Optional<User> userExists = userRepository.findById(userId);
		return userExists.orElse(null);
	}


}
