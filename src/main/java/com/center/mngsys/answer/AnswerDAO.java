package com.center.mngsys.answer;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertAnswer(AnswerVO vo) {
		int result = sqlSession.insert("Progress.insertProgress", vo);
		return result;
	}
	
	public int updateAnswer(AnswerVO vo) {
		int result = sqlSession.update("Progress.updateProgress", vo);
		return result;
	}
	
	public int deleteAnswer(int id) {
		int result = sqlSession.delete("Progress.deleteProgress", id);
		return result;
	}
	
	public AnswerVO getAnswer(int id) {
		AnswerVO answer = sqlSession.selectOne("Answer.getAnswer", id);
		return answer;
	}
	
	public List<AnswerVO> getAnswerList() {
		List<AnswerVO> answerList = sqlSession.selectList("Answer.getAnswerList");
		return answerList;
	}
}
