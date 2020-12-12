package com.center.mngsys.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/notice")
public class NoticeController {
	@Autowired
	NoticeServiceImpl noticeService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String noticelist(Model model) {
		model.addAttribute("list", noticeService.getNoticeList());
		return "notice/list";
	}
	
	@RequestMapping(value="/read/{id}", method=RequestMethod.GET)
	public String readPost(@PathVariable("id") int id, Model model) {
		NoticeVO noticeVO = noticeService.getNotice(id);
		model.addAttribute("u", noticeVO);
		return "notice/read";
	}
}
