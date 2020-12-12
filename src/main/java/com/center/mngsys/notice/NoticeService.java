package com.center.mngsys.notice;

import java.util.List;

public interface NoticeService {
	public int insertNotice(NoticeVO vo);
	public int updateNotice(NoticeVO vo);
	public int deleteNotice(int id);
	public NoticeVO getNotice(int id);
	public List<NoticeVO> getNoticeList();
}
