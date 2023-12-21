package com.threeteam.dango.controller.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.ReplyService;

@RestController
@RequestMapping
public class ReplyController {

	@Autowired
	ReplyService replyService;
	
	@GetMapping
	public String replyMain() {
		return "";
	}
	
	@GetMapping
	public String insertReply() {
		return "";
	}
	
	@GetMapping
	public String deleteReply() {
		return "";
	}
	
	@GetMapping
	public String updateReply() {
		return "";
	}
	
	@GetMapping
	public String getReply() {
		return "";
	}
	
	@GetMapping
	public String getReplyList() {
		return "";
	}
}
