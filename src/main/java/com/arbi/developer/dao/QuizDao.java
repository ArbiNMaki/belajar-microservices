package com.arbi.developer.dao;

import com.arbi.developer.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
