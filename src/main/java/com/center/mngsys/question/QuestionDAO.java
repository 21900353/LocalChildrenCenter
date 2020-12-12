package com.center.mngsys.question;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertQuestion(QuestionVO vo) {
		int result = sqlSession.insert("Question.insertQuestion", vo);
		return result;
	}
	
	public int updateQuestion(QuestionVO vo) {
		int result = sqlSession.update("Question.updateQuestion", vo);
		return result;
	}
	
	public int deleteQuestion(int id) {
		int result = sqlSession.delete("Question.deleteQuestion", id);
		return result;
	}
	
	public QuestionVO getQuestion(int id) {
		QuestionVO question = sqlSession.selectOne("Question.getQuestion", id);
		return question;
	}
	
	public List<QuestionVO> getQuestionList() {
		List<QuestionVO> questionList = sqlSession.selectList("Question.getQuestionList");
		return questionList;
	}
}
