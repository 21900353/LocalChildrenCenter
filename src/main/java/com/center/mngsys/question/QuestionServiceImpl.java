package com.center.mngsys.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	QuestionDAO questionDAO;
	
	@Override
	public int insertQuestion(QuestionVO vo) {
		return questionDAO.insertQuestion(vo);
	}

	@Override
	public int updateQuestion(QuestionVO vo) {
		return questionDAO.updateQuestion(vo);
	}

	@Override
	public int deleteQuestion(int sid) {
		return questionDAO.deleteQuestion(sid);
	}

	@Override
	public QuestionVO getQuestion(int sid) {
		return questionDAO.getQuestion(sid);
	}

	@Override
	public List<QuestionVO> getQuestionList() {
		return questionDAO.getQuestionList();
	}
}
