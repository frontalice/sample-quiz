package com.example.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.quiz.entity.QuizUser;
import com.example.quiz.repository.QuizUserRepository;

@Service
public class QuizUserDetailsService implements UserDetailsService{
	@Autowired
	QuizUserRepository quizUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		QuizUser user = quizUserRepository.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + "is not found.");
		}
		return new QuizUserDetails(user);
	}
}
