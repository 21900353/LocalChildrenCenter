package com.center.mngsys.progress;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProgressDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertProgress(ProgressVO vo) {
		int result = sqlSession.insert("Progress.insertProgress", vo);
		return result;
	}
	
	public int updateProgress(ProgressVO vo) {
		int result = sqlSession.update("Progress.updateProgress", vo);
		return result;
	}
	
	public int deleteProgress(int sid) {
		int result = sqlSession.delete("Progress.deleteProgress", sid);
		return result;
	}
	
	public ProgressVO getProgress(int sid) {
		ProgressVO progress = sqlSession.selectOne("Progress.getProgress", sid);
		return progress;
	}
	
	public List<ProgressVO> getProgressList(int grade) {
		List<ProgressVO> progressList = sqlSession.selectList("Progress.getProgressList", grade);
		return progressList;
	}
}
