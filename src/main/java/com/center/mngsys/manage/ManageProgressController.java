package com.center.mngsys.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.center.mngsys.progress.ProgressServiceImpl;
import com.center.mngsys.progress.ProgressVO;

@Controller
@RequestMapping(value="/manage/progress")
public class ManageProgressController {
	@Autowired
	ProgressServiceImpl progressService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String progresslist(Model model) {
		model.addAttribute("list", progressService.getProgressList());
		return "manage/progress/list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addStudent() {
		return "manage/notice/add";
	}
	
	@RequestMapping(value="/addok", method=RequestMethod.POST)
	public String addStudentOK(ProgressVO vo) {
		if (progressService.insertProgress(vo) == 0) {
			System.out.println("학생 추가 실패");
		}
		else {
			System.out.println("학생 추가 성공");
		}
		return "redirect:manage/progress/list";
	}
	
	@RequestMapping(value="/updateok", method=RequestMethod.POST)
	public String updateProgressOK(List<ProgressVO> vo) {
		for (ProgressVO progress : vo) {
			if (progressService.updateProgress(progress) == 0) {
				System.out.println("학습상태 수정 실패");
			}
			else {
				System.out.println("학습상태 수정 성공");
			}
		}
		return "redirect:manage/progress/list";
	}
	
	@RequestMapping(value="/deleteok/{id}", method=RequestMethod.GET)
	public String deleteStudentOK(@PathVariable("sid") int sid) {
		if (progressService.deleteProgress(sid) == 0) {
			System.out.println("학생 삭제 실패");
		}
		else {
			System.out.println("학생 삭제 성공");
		}
		return "redirect:../manage/progress/list";
	}
}
