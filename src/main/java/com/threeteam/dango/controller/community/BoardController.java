

package com.threeteam.dango.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardVO;

@RestController
@RequestMapping("/community/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/boardList")
	public String boardList(BoardVO boardVO, Model model) {
		model.addAttribute("boardList", boardService.getBoardList(boardVO));
		return "CommunityList.jsp";
	}
	
	@GetMapping("/boardView")
	public String boardView(Model model, int boardId) {
		modle.
	}
	@GetMapping("/boardInsert")
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "CommunityNewPost.jsp";
	}
	
	@GetMapping("/boardUpdate")
	public String updateBoard(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "";
	}
	
	@GetMapping("/boardDelete")
	public String deleteBoard(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "";
	}
	
}