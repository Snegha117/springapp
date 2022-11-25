package com.sella;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("home")
	public String getHome() {
		return "welcome home";
	}

}
