package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String sayHello()
	{
		return "WELCOME TO FINTECH CSI";
	}
	
	@GetMapping("/csiaddress")
	public String sayCSIAddress()
	{
		return "INSPIRIA MALL | PUNE";
	}
	
	@GetMapping("/services")
	public String sayCSIServices()
	{
		return "SOFTWARE DEVLOPMENT";
	}

}
