package com.threeteam.dango.controller.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.CommentService;

@RestController
@RequestMapping
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@GetMapping
	public String commentMain() {
		return "";
	}
	
	@GetMapping
	public String insertComment() {
		return "";
	}
	
	@GetMapping
	public String deleteComment() {
		return "";
	}
	
	@GetMapping
	public String updateComment() {
		return "";
	}
	
	@GetMapping
	public String getComment() {
		return "";
	}
	
	@GetMapping
	public String getCommentList() {
		return "";
	}
}
