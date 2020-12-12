package com.center.mngsys.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.center.mngsys.notice.NoticeServiceImpl;
import com.center.mngsys.notice.NoticeVO;

@Controller
@RequestMapping(value="/manage/notice")
public class ManageNoticeController {
	@Autowired
	NoticeServiceImpl noticeService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String noticelist(Model model) {
		model.addAttribute("list", noticeService.getNoticeList());
		return "manage/notice/list";
	}
	
	@RequestMapping(value="/read/{id}", method=RequestMethod.GET)
	public String readPost(@PathVariable("id") int id, Model model) {
		NoticeVO noticeVO = noticeService.getNotice(id);
		model.addAttribute("u", noticeVO);
		return "manage/notice/read";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String writePost() {
		return "manage/notice/write";
	}
	
	@RequestMapping(value="/writeok", method=RequestMethod.POST)
	public String writePostOK(NoticeVO vo) {
		if (noticeService.insertNotice(vo) == 0) {
			System.out.println("공지 쓰기 실패");
		}
		else {
			System.out.println("공지 쓰기 성공");
		}
		return "redirect:/manage/notice/list";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		NoticeVO noticeVO = noticeService.getNotice(id);
		model.addAttribute("u", noticeVO);
		return "manage/notice/edit";
	}
	
	@RequestMapping(value="/editok", method=RequestMethod.POST)
	public String editPostOK(NoticeVO vo) {
		if (noticeService.updateNotice(vo) == 0) {
			System.out.println("공지 수정 실패");
		}
		else {
			System.out.println("공지 수정 성공");
		}
		return "redirect:/manage/notice/list";
	}
	
	@RequestMapping(value="/deleteok/{id}", method=RequestMethod.GET)
	public String deletePostOK(@PathVariable("id") int id) {
		if (noticeService.deleteNotice(id) == 0) {
			System.out.println("공지 삭제 실패");
		}
		else {
			System.out.println("공지 삭제 성공");
		}
		return "redirect:/manage/notice/list";
	}
}
