package com.threeteam.dango.controller.community;

import org.springframework.web.servlet.ModelAndView;

import com.threeteam.dango.dao.community.BoardDAO;
import com.threeteam.dango.vo.community.BoardVO;

public class getBoardListController {

	public ModelAndView getBoardList (BoardVO boardVO, BoardDAO boardDAO, ModelAndView mav) {
		
		mav.addObject("boardList", boardDAO.getBoardList(boardVO));
		mav.setViewName(".jsp");
		
		return mav;
	}
}
