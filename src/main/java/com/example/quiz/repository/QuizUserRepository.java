package com.example.quiz.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.quiz.entity.QuizUser;

public interface QuizUserRepository extends CrudRepository<QuizUser, Integer>{
	@Query("SELECT * FROM quiz_user where user_name = :name")
	QuizUser findByUserName (@Param("name") String name);
}
