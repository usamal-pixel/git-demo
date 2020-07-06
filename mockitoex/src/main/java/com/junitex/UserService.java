package com.junitex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String data() {
		
		return "welcome";
	}

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {

		return userRepository.save(user);
	}

	public List<User> getUsers() {

		List<User> users = userRepository.findAll();
		return users;
	}

	public List<User> getUserByAddress(String address) {

		return userRepository.findByAddress(address);

	}

	public void deleteUser(User user) {
		userRepository.delete(user);
	}

}
