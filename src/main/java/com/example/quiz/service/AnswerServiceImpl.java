package com.example.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.quiz.entity.Answer;
import com.example.quiz.repository.AnswerRepository;

@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {
	@Autowired
	AnswerRepository repository;
	
	@Override
	public void insertAnswer(Answer answer) {
		repository.save(answer);
	}
	
	@Override
	public Long countCorrects(String name) {
		return repository.countCorrectedQuizzes(name);
	}
}
