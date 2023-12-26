package com.threeteam.dango.controller.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.service.community.CommentService;
import com.threeteam.dango.vo.community.CommentVO;

@RestController
@SessionAttributes("comment")
@RequestMapping("/comment/*")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@GetMapping("/")
	public String commentMain(CommentVO commentVO, Model model) {
		return "/comment/main";
	}
	
	@GetMapping("/insertComment")
	public String insertComment(CommentVO commentVO) {
		commentService.insertComment(commentVO);
		return "getCommentList";
	}
	
	@GetMapping("/deleteComment")
	public String deleteComment(CommentVO commentVO) {
		commentService.deleteComment(commentVO);
		return "getCommentList";
	}
	
	@GetMapping("/updateComment")
	public String updateComment(CommentVO commentVO) {
		commentService.updateComment(commentVO);
		return "getCommentList";
	}
	
	@GetMapping("/getComment")
	public String getComment(CommentVO commentVO, Model model) {
		model.addAttribute("comment", commentService.getComment(commentVO));
		return ".jsp";
	}
	
	@GetMapping("/getCommentList")
	public String getCommentList(CommentVO commentVO, Model model) {
		model.addAttribute("comment", commentService.getCommantList(commentVO));
		return ".jsp";
	}
}
