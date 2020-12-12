package com.center.mngsys.notice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	NoticeDAO noticeDAO;
	
	@Override
	public int insertNotice(NoticeVO vo) {
		return noticeDAO.insertNotice(vo);
	}

	@Override
	public int updateNotice(NoticeVO vo) {
		return noticeDAO.updateNotice(vo);
	}

	@Override
	public int deleteNotice(int id) {
		return noticeDAO.deleteNotice(id);
	}

	@Override
	public NoticeVO getNotice(int id) {
		return noticeDAO.getNotice(id);
	}

	@Override
	public List<NoticeVO> getNoticeList() {
		return noticeDAO.getNoticeList();
	}
	
}
