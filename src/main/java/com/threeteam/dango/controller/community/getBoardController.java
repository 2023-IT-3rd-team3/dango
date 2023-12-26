package com.threeteam.dango.controller.community;

import org.springframework.web.servlet.ModelAndView;

import com.threeteam.dango.dao.community.BoardDAO;
import com.threeteam.dango.vo.community.BoardVO;

public class getBoardController {

	public ModelAndView getBoard(BoardVO boardVO, BoardDAO boardDAO, ModelAndView mav) {
		
		mav.addObject("board", boardDAO.getBoard(boardVO));
		mav.setViewName(".jsp");
		
		return mav;
	}
}
