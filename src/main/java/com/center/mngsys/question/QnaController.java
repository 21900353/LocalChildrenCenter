package com.center.mngsys.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/qna")
public class QnaController {
	@Autowired
	QuestionServiceImpl questionService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String questionlist(Model model) {
		model.addAttribute("list", questionService.getQuestionList());
		return "qna/list";
	}
	
	@RequestMapping(value="/read?id={id}", method=RequestMethod.GET)
	public String readQuestion(@PathVariable("id") int id, Model model) {
		QuestionVO questionVO = questionService.getQuestion(id);
		model.addAttribute("q", questionVO);
		return "question/read";
	}
}
