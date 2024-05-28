package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/get")
	public String sample() {
		return "この画面はウィルスに感染されています";
	}
}

