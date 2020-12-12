package com.center.mngsys.manage;

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
	
	@RequestMapping(value="/{grade}", method=RequestMethod.GET)
	public String progresslist(@PathVariable("grade") int grade, Model model) {
		model.addAttribute("list", progressService.getProgressList(grade));
		return "manage/progress/view";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addStudent() {
		return "manage/progress/add";
	}
	
	@RequestMapping(value="/addok", method=RequestMethod.POST)
	public String addStudentOK(ProgressVO vo) {
		if (progressService.insertProgress(vo) == 0) {
			System.out.println("학생 추가 실패");
		}
		else {
			System.out.println("학생 추가 성공");
		}
		return "redirect:/manage/progress/view";
	}
	
	@RequestMapping(value="/updateok", method=RequestMethod.POST)
	public String updateProgressOK(ProgressVO vo) {
		int grade = vo.getGrade();
		if (progressService.updateProgress(vo) == 0) {
			System.out.println("학습상태 수정 실패");
		}
		else {
			System.out.println("학습상태 수정 성공");
		}
		return "redirect:/manage/progress/" + grade;
	}
	
	@RequestMapping(value="/deleteok/{id}", method=RequestMethod.GET)
	public String deleteStudentOK(@PathVariable("sid") int sid) {
		if (progressService.deleteProgress(sid) == 0) {
			System.out.println("학생 삭제 실패");
		}
		else {
			System.out.println("학생 삭제 성공");
		}
		return "redirect:/manage/progress/view";
	}
}
