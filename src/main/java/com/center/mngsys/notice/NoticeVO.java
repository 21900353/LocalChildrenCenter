package com.center.mngsys.notice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NoticeVO {
	private int id;
	private Date postdate;
	private String title;
	private String content;
	private String postdate_f;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPostdate_f() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(getPostdate());
	}
}
