package com.jigsaw.endpoint;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jigsaw.bean.JSQuestions;

public interface JSQuestionsRepository extends MongoRepository<JSQuestions, String> {

}
