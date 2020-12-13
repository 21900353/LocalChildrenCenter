package com.center.mngsys.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.center.mngsys.answer.AnswerServiceImpl;
import com.center.mngsys.answer.AnswerVO;
import com.center.mngsys.question.QuestionServiceImpl;
import com.center.mngsys.question.QuestionVO;

@Controller
@RequestMapping(value="/manage/qna")
public class ManageQnaController {
	@Autowired
	QuestionServiceImpl questionService;
	
	@Autowired
	AnswerServiceImpl answerService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String noticelist(Model model) {
		model.addAttribute("list", questionService.getQuestionList());
		return "manage/qna/list";
	}
	
	@RequestMapping(value="/read/{id}", method=RequestMethod.GET)
	public String readQuestion(@PathVariable("id") int id, Model model) {
		QuestionVO questionVO = questionService.getQuestion(id);
		AnswerVO answerVO = answerService.getAnswer(id);
		model.addAttribute("q", questionVO);
		model.addAttribute("a", answerVO);
		return "manage/qna/read";
	}
	
	@RequestMapping(value="/answer/{id}", method=RequestMethod.GET)
	public String addAnswer(@PathVariable("id") int id, Model model) {
		QuestionVO questionVO = questionService.getQuestion(id);
		model.addAttribute("q", questionVO);
		return "manage/qna/answer";
	}
	
	@RequestMapping(value="/answerok", method=RequestMethod.POST)
	public String addAnswerOK(AnswerVO vo) {
		if (answerService.insertAnswer(vo) == 0) {
			System.out.println("답변 쓰기 실패");
		}
		else {
			System.out.println("답변 쓰기 성공");
		}
		return "redirect:/manage/qna/list";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String editAnswer(@PathVariable("id") int id, Model model) {
		AnswerVO answerVO = answerService.getAnswer(id);
		model.addAttribute("a", answerVO);
		return "manage/qna/edit";
	}
	
	@RequestMapping(value="/editok", method=RequestMethod.POST)
	public String editAnswerOK(AnswerVO vo) {
		if (answerService.updateAnswer(vo) == 0) {
			System.out.println("답변 수정 실패");
		}
		else {
			System.out.println("답변 수정 성공");
		}
		return "redirect:/manage/qna/list";
	}
	
	@RequestMapping(value="/deleteqok/{id}", method=RequestMethod.GET)
	public String deleteQuestionOK(@PathVariable("id") int id) {
		if (questionService.deleteQuestion(id) == 0) {
			System.out.println("질문 삭제 실패");
		}
		else {
			
			System.out.println("질문 삭제 성공");
		}
		return "redirect:/manage/qna/list";
	}
	
	@RequestMapping(value="/deleteaok/{id}", method=RequestMethod.GET)
	public String deleteAnswerOK(@PathVariable("id") int id, QuestionVO qvo) {
		if (answerService.deleteAnswer(id) == 0) {
			System.out.println("답변 삭제 실패");
		}
		else {
			System.out.println("답변 삭제 성공");
		}
		return "redirect:/manage/qna/list";
	}
}
