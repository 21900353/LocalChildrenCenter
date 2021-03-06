package com.center.mngsys.progress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/progress")
public class ProgressController {
	@Autowired
	ProgressServiceImpl progressService;
	
	@RequestMapping(value="/{grade}", method=RequestMethod.GET)
	public String progresslist(@PathVariable("grade") int grade, Model model) {
		model.addAttribute("list", progressService.getProgressList(grade));
		return "progress/view";
	}
}
