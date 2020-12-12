package com.center.mngsys.progress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/progress")
public class ProgressController {
	@Autowired
	ProgressServiceImpl progressService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String progresslist(Model model) {
		model.addAttribute("list", progressService.getProgressList());
		return "progress/list";
	}
}
