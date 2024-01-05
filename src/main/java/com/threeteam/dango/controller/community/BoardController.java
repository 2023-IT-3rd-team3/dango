

package com.threeteam.dango.controller.community;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.service.community.BoardService;
import com.threeteam.dango.vo.community.BoardVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/community*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	private UserVO getSessionUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		UserVO userInfo = (UserVO)session.getAttribute("user");
		
		return userInfo;
	}
	
	@GetMapping("")
	public String boardMain(BoardVO boardVO, Model model) {
		return "community/Community";
	}
	
	@GetMapping("/boardInsert")
	public String getInsertPage(BoardVO boardVO, HttpServletRequest request) {
		UserVO user = getSessionUser(request);
		if(user == null)
			return "redirect:/user/login";
		return "community/CommunityNewPost";
	}
	@PostMapping("/boardInsert")
	public String insertBoard(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		
		return "redirect:/community/free";
	}
	
	@PostMapping("/boardUpdatePage")
	public String getUpdatePage(BoardVO boardVO) {
		return "community/CommunityEditPost";
	}
	@PostMapping("/boardUpdate")
	public String updateBoard(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "redirect:/boardView/" + boardVO.getBoardId();
	}
	
	@PostMapping("/boardDelete")
	public String deleteBoard(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "redirect:/community";
	}
	
	@GetMapping("/boardView/{boardId}")
	public String BoardView(@PathVariable("boardId") Long boardId, BoardVO boardVO, Model model) {
		boardVO = boardService.getBoard(boardId);
		model.addAttribute("board", boardVO);
		
		return "community/CommunityPostPage";
	}
	
	@GetMapping("/{boardCategory}")
	public String getBoardList(@PathVariable("boardCategory") String boardCategory, BoardVO boardVO, Model model) {
		if(boardCategory.equals("free")) 			
			boardVO.setBoardNotice(0);
		else if(boardCategory.equals("notice"))		
			boardVO.setBoardNotice(1);
		else
			return "redirect:/community";
		
		model.addAttribute("category", boardCategory);
		model.addAttribute("boardList", boardService.getBoardList(boardVO));
		return "community/CommunityList";
	}
	
	
	/* ----------- 寃��깋湲곕뒫 ----------- */
	@GetMapping("/CommunitySearch")
	public String communitySearch(@RequestParam("boardTitle") String boardTitle, @RequestParam("userId") String userId, Model model) {
		List<BoardVO> boardList = boardService.communitySearch(boardTitle, userId);
        model.addAttribute("communitySearch", boardList);
        return "community/CommunityList";
	}
	
	/* ----------- 愿�由ъ옄 ----------- */
	// 愿�由ъ옄 泥댄겕
	@GetMapping("/admincheck")
	public boolean adminCheck(BoardVO boardVO) {
		boolean adminCheck = boardService.adminCheck(boardVO);
		return adminCheck;
	}
	
}