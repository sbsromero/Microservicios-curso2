package com.galleryService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GalleryServiceController {

	@Autowired
	private Environment env;

	@GetMapping("/info")
	public String getInfo() {
		return "Running in port: " + env.getProperty("local.server.port");
	}
}
