package com.parthu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parthu.entity.CitizenPlan;
import com.parthu.search.SearchRequest;
import com.parthu.service.ReportService;


@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@GetMapping("/")
	public String getSeach(Model model) {
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("req",new SearchRequest());
		model.addAttribute("names",service.getPlanNames());
		model.addAttribute("status",service.getPlanStatus());
	}
	
	@PostMapping("/search")
	public String hadleSearchBtn(@ModelAttribute("request") SearchRequest search ,Model model) {
		List<CitizenPlan> plan = service.search(search);
		model.addAttribute("plans",plan);
		init(model);
		return "index";
	}

}
