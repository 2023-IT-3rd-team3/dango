package com.threeteam.dango.controller.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.service.community.CommentService;
import com.threeteam.dango.vo.community.CommentVO;

@RestController
@RequestMapping("/comment*")
public class CommentController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	CommentService commentService;
	
	@PostMapping(value="/insertComment", consumes = "application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<CommentVO> insertComment(@RequestBody CommentVO commentVO) {
		if(commentService.insertComment(commentVO) == 1) {
			return new ResponseEntity<>(commentService.getComment(commentVO), HttpStatus.OK);
		}
		return null;
	}
	
	@PostMapping(value="/deleteComment", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String deleteComment(@RequestBody CommentVO commentVO) {
		if(commentService.deleteComment(commentVO) == 1)
			return "success";
		return "fail";
	}
	
	@PostMapping(value="/updateComment", consumes = "application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	public CommentVO updateComment(@RequestBody CommentVO commentVO) {
		if(commentService.updateComment(commentVO) == 1)
			return commentService.getComment(commentVO);
		return null;
	}
	
	@PostMapping(value="/getCommentList", consumes = "application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<CommentVO>> getCommentList(@RequestBody CommentVO commentVO) {
		return new ResponseEntity<>(commentService.getCommentList(commentVO), HttpStatus.OK);
	}
	
}
