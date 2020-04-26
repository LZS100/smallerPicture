package com.linzs.smallerPicture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloWordController {
	@GetMapping("test")
	public Object test() {
		return "this is a test";
	}
}
