package com.example.quiz.service;

import com.example.quiz.entity.Answer;

public interface AnswerService {
	void insertAnswer(Answer answer);
	Long countCorrects(String name);
}
