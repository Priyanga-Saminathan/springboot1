package com.example.MySecondApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class Questioncontroller {
	@GetMapping("allQuestions")
	public String getQuestion() {
		return "Hi, these are your questions";
	}
	
	
}
