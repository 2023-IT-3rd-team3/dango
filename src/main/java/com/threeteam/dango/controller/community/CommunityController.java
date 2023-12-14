package com.threeteam.dango.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.threeteam.dango.service.community.CommunityService;

@Controller
@RequestMapping("/community/*")
public class CommunityController {

	@Autowired
	CommunityService ComService;
	
}
