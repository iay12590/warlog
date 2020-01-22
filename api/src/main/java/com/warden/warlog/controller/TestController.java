package com.warden.warlog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="warden@warden.com">warden</a>
 * @version 1.0.0
 * @date 2020/1/22
 */
@RestController
@RequestMapping
public class TestController {

	@GetMapping()
	public String test() {
		return "hello world";
	}

}