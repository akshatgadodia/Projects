package com.blogapplication.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapplication.dto.LoginDto;
import com.blogapplication.dto.RegisterDto;
import com.blogapplication.entity.Role;
import com.blogapplication.entity.User;
import com.blogapplication.repository.RoleRepository;
import com.blogapplication.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/login")
	public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken
				(loginDto.getUsernameOrEmail(), loginDto.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return new ResponseEntity<>("User signed-in successfully",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody RegisterDto registerDto){
		if(userRepository.existsByUsername(registerDto.getUsername())) {
			return new ResponseEntity<>("Username already taken",HttpStatus.BAD_REQUEST);
		}
		if(userRepository.existsByEmail(registerDto.getEmail())) {
			return new ResponseEntity<>("Email already taken",HttpStatus.BAD_REQUEST);
		}
		User user = new User();
		user.setEmail(registerDto.getEmail());
		user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
		user.setUsername(registerDto.getUsername());
		user.setName(registerDto.getName());
		Role role = roleRepository.findByName("USER").get();
		user.setRoles(Collections.singleton(role));
		userRepository.save(user);
		return new ResponseEntity<>("User Registered Successfully",HttpStatus.OK);
	}
	
}
