package com.center.mngsys.question;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuestionVO {
	private int id;
	private Date postdate;
	private String name;
	private String title;
	private String content;
	private int answer_id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getPostdate_f() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return format.format(getPostdate());
	}

}
