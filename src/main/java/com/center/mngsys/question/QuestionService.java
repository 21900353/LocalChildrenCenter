package com.center.mngsys.question;

import java.util.List;

public interface QuestionService {
	public int insertQuestion(QuestionVO vo);
	public int updateQuestion(QuestionVO vo);
	public int deleteQuestion(int id);
	public QuestionVO getQuestion(int id);
	public List<QuestionVO> getQuestionList();
}
