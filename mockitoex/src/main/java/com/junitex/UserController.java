package com.junitex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/data")
	public String data(){
		return userService.data();
	}
	
	/*@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user){
		return userService.addUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> findAllUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/getUserByAddress/{address}")
	public List<User> findUserByAddress(@PathVariable String address){
		return userService.getUserByAddress(address);
	}
	
	@DeleteMapping("/remove")
	public User deleteUser(@RequestBody User user){
		userService.deleteUser(user);
		return user;
	}*/
	

}
