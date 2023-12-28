

package com.threeteam.dango.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardVO;

import lombok.extern.log4j.Log4j;

@RestController
@SessionAttributes("board")
@RequestMapping("/community/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/")
	public String boardMain(BoardVO boardVO, Model model) {
		return "/community/main";
	}
	
	@GetMapping("/boardInsert")
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "getBoardList";
	}
	
	@GetMapping("/boardUpdate")
	public String updateBoard(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "getBoardList";
	}
	
	@GetMapping("/boardDelete")
	public String deleteBoard(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "getBoardList";
	}
	
	@GetMapping("/boardView")
	public String BoardView(BoardVO boardVO) {
		return "community/CommunityPostpage";
	}
	
	@GetMapping("/getBoard")
	public String getBoard(BoardVO boardVO, Model model) {
		model.addAttribute("board", boardService.getBoard(boardVO));
		return "community/CommunityNewPost";
	}
	
	@GetMapping("/getBoardList")
	public String getBoardList(BoardVO boardVO, Model model) {
		model.addAttribute("boardList", boardService.getBoardList(boardVO));
		return "community/CommunityList";
	}
	
	@GetMapping("/getBoardInfo")
	public String getBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("boardInfo", boardService.getBoardInfo(boardVO));
		return "CommunityNewPost.jsp";
	}
	
	@GetMapping("/getBoardInfoList")
	public String getBoardInfoList(BoardVO boardVO, Model model) {
		model.addAttribute("boardInfoList", boardService.getBoardInfoList(boardVO));
		return "CommunityNewPost.jsp";
	}
	
	
	/* ----------- 검색기능 ----------- */
	@GetMapping("/CommunitySearch")
	public String communitySearch() {
		return "getBordList";
	}
	
	/* ----------- 관리자 ----------- */
	// 관리자 체크
	@GetMapping("/admincheck")
	public boolean adminCheck(BoardVO boardVO) {
		boolean adminCheck = boardService.adminCheck(boardVO);
		return adminCheck;
	}
	
}