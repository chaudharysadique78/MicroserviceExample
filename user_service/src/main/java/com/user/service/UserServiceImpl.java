package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(new User(131L, "Sadik Chaudhary", "8866557799"),
			new User(132L, "Akshay Sharma", "8866557700"), 
			new User(133L, "Vijay Jain", "8866557722"),
			new User(134L,"Nishant Gupta","8866557711"));

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
