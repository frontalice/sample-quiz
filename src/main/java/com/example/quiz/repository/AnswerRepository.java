package com.example.quiz.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.quiz.entity.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Integer>{
//	@Query("SELECT COUNT(DISTINCT quiz_id) FROM answer\n"
//			+ "WHERE answerer = :name AND \"result\" = true;") // PostgreSQL
	@Query("SELECT COUNT(DISTINCT quiz_id) FROM answer\n"
			+ "WHERE answerer = :name AND result = true;") // MySQL
	Long countCorrectedQuizzes (@Param("name") String name);
}
