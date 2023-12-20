

package com.threeteam.dango.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardVO;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/community/*")
@Log4j
public class BoardController {

	@Autowired
	BoardService boardService;
	
	// 커뮤니티 홈(community)
	@GetMapping
	public String boardHome(BoardVO boardVO, Model model) {
		return "/Home";
	}
	
	// 게시판 목록(communitylist)
	@GetMapping("/boardList")
	public String boardList(BoardVO boardVO, Model model) {
		model.addAttribute("boardList", boardService.getBoardList(boardVO));
		return "CommunityList.jsp";
	}
	
	// 공지사항 목록(communityinfo)
	@GetMapping()
	public String boardInfoList() {
		return "";
	}
	
	// 게시글 추가(communitynewpost)
	@GetMapping("/boardInsert")
	public String insertBoard(BoardVO boardVO) {
		if()
		boardService.insertBoard(boardVO);
		return "CommunityNewPost.jsp";
	}
	
	// 게시글 수정(communityeditpost)
	@GetMapping("/boardUpdate")
	public String updateBoard(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "";
	}
	
	// 게시글 삭제(삭제 후 -> communitylist)
	@GetMapping("/boardDelete")
	public String deleteBoard(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "";
	}
	
	// 관리자 체크
	@GetMapping("/admincheck")
	public boolean adminCheck(BoardVO boardVO) {
		boolean adminCheck = boardService.adminCheck(boardVO);
		return adminCheck;
	}
	
}