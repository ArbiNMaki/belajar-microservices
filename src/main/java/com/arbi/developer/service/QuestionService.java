package com.arbi.developer.service;

import com.arbi.developer.Question;
import com.arbi.developer.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        List<Question> questions = questionDao.findByCategory(category);
        System.out.println("Executing query for category: " + category);
        System.out.println("Questions found: " + questions);
        return questions;
    }

    public String addQuestion(Question question) {
        System.out.println("Received question: " + question);
        questionDao.save(question);
        return "success";
    }
}
