package com.user.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list=List.of(
				new User(1211,"swet","swet@gmail.com"),
				new User(1212,"harsh","harsh@gmail.com"),
				new User(1213,"paras","pras@gmail.com"),
				new User(1214,"subham","sub@gmail.com")
			);
		
	@Override
	public User getUserDetails(int id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId()==id).findAny().orElse(null);
	}
}
