package com.center.mngsys.answer;

import java.util.List;

public interface AnswerService {
	public int insertAnswer(AnswerVO vo);
	public int updateAnswer(AnswerVO vo);
	public int deleteAnswer(int id);
	public AnswerVO getAnswer(int id);
	public List<AnswerVO> getAnswerList();
}
