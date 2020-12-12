package com.center.mngsys.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertNotice(NoticeVO vo) {
		int result = sqlSession.insert("Notice.insertNotice", vo);
		return result;
	}
	
	public int updateNotice(NoticeVO vo) {
		int result = sqlSession.update("Notice.updateNotice", vo);
		return result;
	}
	
	public int deleteNotice(int id) {
		int result = sqlSession.delete("Notice.deleteNotice", id);
		return result;
	}
	
	public NoticeVO getNotice(int id) {
		NoticeVO notice = sqlSession.selectOne("Notice.getNotice", id);
		return notice;
	}
	
	public List<NoticeVO> getNoticeList() {
		List<NoticeVO> noticeList = sqlSession.selectList("Notice.getNoticeList");
		return noticeList;
	}
}
