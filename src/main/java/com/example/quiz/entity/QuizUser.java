package com.example.quiz.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizUser {
	@Id
	private Integer id;
	private String userName;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
}
