package com.mysh.shareHouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysh.shareHouse.model.Faq;
import com.mysh.shareHouse.service.FaqService;

@RestController
public class FaqController {

	@Autowired
	private FaqService faqService;
	
	@GetMapping("/faq")
	public List<Faq> findInterview() {
		
		List<Faq> faqList = faqService.findAll();
		
		return faqList;
	}
}
