package com.example.springboot_test_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_test_3.entity.Netsuserinfo;
import com.example.springboot_test_3.service.NetsuserinfoService;

@RestController
public class NetsuserinfoController {
	@Autowired
	private NetsuserinfoService netsuserinfoService;
	
	@RequestMapping("/user")
	public String index() {
		return "Hello World";
	}
	@RequestMapping(value="/netsuserinfo",method=RequestMethod.GET)
	public List<Netsuserinfo> getNetsuserinfoList(){
		List<Netsuserinfo> netsuserinfoList = netsuserinfoService.getNetsuserinfoList();
		return netsuserinfoList;
	}

}
