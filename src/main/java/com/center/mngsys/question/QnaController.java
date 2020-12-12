package com.center.mngsys.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.center.mngsys.answer.AnswerServiceImpl;
import com.center.mngsys.answer.AnswerVO;

@Controller
@RequestMapping(value="/qna")
public class QnaController {
	@Autowired
	QuestionServiceImpl questionService;

	@Autowired
	AnswerServiceImpl answerService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String questionlist(Model model) {
		model.addAttribute("list", questionService.getQuestionList());
		return "qna/list";
	}
	
	@RequestMapping(value="/read/{id}", method=RequestMethod.GET)
	public String readQuestion(@PathVariable("id") int id, Model model) {
		QuestionVO questionVO = questionService.getQuestion(id);
		AnswerVO answerVO = answerService.getAnswer(id);
		model.addAttribute("q", questionVO);
		model.addAttribute("a", answerVO);
		return "qna/read";
	}
	
	@RequestMapping(value="/post", method=RequestMethod.GET)
	public String postQuestion(Model model) {
		return "qna/post";
	}
	
	@RequestMapping(value="/postok", method=RequestMethod.POST)
	public String postQuestionOk(QuestionVO vo) {
		if (questionService.insertQuestion(vo) == 0) {
			System.out.println("질문 등록 실패");
		}
		else {
			System.out.println("질문 등록 성공");
		}
		return "redirect:list";
	}
}
