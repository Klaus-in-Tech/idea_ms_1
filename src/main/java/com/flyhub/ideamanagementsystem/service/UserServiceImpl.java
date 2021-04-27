package com.flyhub.ideamanagementsystem.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.flyhub.ideamanagementsystem.dto.UserRegistrationDto;
import com.flyhub.ideamanagementsystem.entity.User;
import com.flyhub.ideamanagementsystem.entity.UserRole;
import com.flyhub.ideamanagementsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new UserRole("ROLE_USER")));

		return userRepository.save(user);
	}

}
