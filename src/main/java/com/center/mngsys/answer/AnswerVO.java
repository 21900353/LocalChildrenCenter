package com.center.mngsys.answer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnswerVO {
	private int id;
	private Date postdate;
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
