

package com.threeteam.dango.controller.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/community*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("")
	public String boardMain(BoardVO boardVO, Model model) {
		return "community/Community";
	}
	
	@GetMapping("/boardInsert")
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "community/CommunityNewPost";
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
		return "CommunityNewPost.jsp";
	}
	
	@GetMapping("/getBoardList")
	public String getBoardList(BoardVO boardVO, Model model) {
		model.addAttribute("boardList", boardService.getBoardList(boardVO));
		return "CommunityList.jsp";
	}
	
	@GetMapping("/getBoardInfo")
	public String getBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("boardInfo", boardService.getBoardInfo(boardVO));
		return "CommunityNewPost.jsp";
	}
	
	@GetMapping("/getBoardInfoList")
	public String getBoardInfoList(BoardVO boardVO, Model model) {
		model.addAttribute("boardInfoList", boardService.getBoardInfoList(boardVO));
		return "CommunityInfo.jsp";
	}
	
	
	/* ----------- 寃��깋湲곕뒫 ----------- */
	@GetMapping("/CommunitySearch")
	public String communitySearch(@RequestParam("boardTitle") String boardTitle, @RequestParam("userId") String userId, Model model) {
		List<BoardVO> boardList = boardService.communitySearch(boardTitle, userId);
        model.addAttribute("communitySearch", boardList);
        return "searchResult";
	}
	
	/* ----------- 愿�由ъ옄 ----------- */
	// 愿�由ъ옄 泥댄겕
	@GetMapping("/admincheck")
	public boolean adminCheck(BoardVO boardVO) {
		boolean adminCheck = boardService.adminCheck(boardVO);
		return adminCheck;
	}
	
}