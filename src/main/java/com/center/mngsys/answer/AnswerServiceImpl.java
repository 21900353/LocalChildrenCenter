package com.center.mngsys.answer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {
	@Autowired
	AnswerDAO answerDAO;
	
	@Override
	public int insertAnswer(AnswerVO vo) {
		return answerDAO.insertAnswer(vo);
	}

	@Override
	public int updateAnswer(AnswerVO vo) {
		return answerDAO.updateAnswer(vo);
	}

	@Override
	public int deleteAnswer(int sid) {
		return answerDAO.deleteAnswer(sid);
	}

	@Override
	public AnswerVO getAnswer(int sid) {
		return answerDAO.getAnswer(sid);
	}

	@Override
	public List<AnswerVO> getAnswerList() {
		return answerDAO.getAnswerList();
	}
}
