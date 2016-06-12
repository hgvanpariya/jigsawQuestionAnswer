package com.jigsaw.endpoint;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jigsaw.bean.JSQuestion;

public interface JSQuestionRepository extends MongoRepository<JSQuestion, String> {

}
