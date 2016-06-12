package com.jigsaw.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jigsaw.bean.JSQuestion;
import com.jigsaw.bean.JSQuestions;

@RestController
public class JigsawController {

	@Autowired
	private JSQuestionRepository jsQuestionRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	@RequestMapping(value = "/api/question", method = RequestMethod.POST, consumes = "application/json")
	public JSQuestions createChart(@RequestBody JSQuestions allJsQuestions) {
		List<JSQuestion> questions = allJsQuestions.getQuestions();
		questions.forEach((jsQuestion) -> jsQuestionRepository.save(jsQuestion));
		return allJsQuestions;
	}

	@RequestMapping(value = "/api/all/question", method = RequestMethod.GET)
	public JSQuestions allQuestion() {

		Query query = new Query();
		query.addCriteria(Criteria.where("question").regex("csv format", "i"));
		List<JSQuestion> findQUestionById = mongoTemplate.find(query, JSQuestion.class);

		System.out.println(findQUestionById);
		JSQuestions jsQuestions = new JSQuestions(findQUestionById);

		// List<JSQuestion> questions = allJsQuestions.getQuestions();
		// questions.forEach((jsQuestion) ->
		// jsQuestionRepository.save(jsQuestion));
		return jsQuestions;
	}

	@RequestMapping(value = "/api/one/question", method = RequestMethod.GET)
	public JSQuestion oneQuestion() {

		Query query = new Query();
		query.addCriteria(Criteria.where("question").regex("csv format", "i"));
		List<JSQuestion> findQUestionById = mongoTemplate.find(query, JSQuestion.class);

		return findQUestionById.get(0);
	}

	@RequestMapping(value = "/api/questions", method = RequestMethod.GET)
	public List<JSQuestion> getAllQuestions(ModelMap model) {

		Query query = new Query();
		query.addCriteria(Criteria.where("question").regex(".*", "i"));
		List<JSQuestion> findQUestionById = mongoTemplate.find(query, JSQuestion.class);

		return findQUestionById;
	}

}
