package com.clienteConfigServer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigServerClient {

	@Value("${user.role}")
	private String activeProfile;

	@GetMapping("/activeProfile")
	String getMessage() {
		return this.activeProfile;
	}
}
