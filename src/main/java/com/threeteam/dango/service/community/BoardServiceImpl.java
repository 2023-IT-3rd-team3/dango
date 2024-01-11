package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.community.BoardDAO;
import com.threeteam.dango.vo.community.BoardDTO;
import com.threeteam.dango.vo.community.BoardVO;


@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public Integer countAllByBoardNotice(BoardDTO boardDTO) {
		return boardDAO.countAllByBoardNotice(boardDTO);
	}
	@Override
	public Integer countBoardSearchResult(BoardDTO boardDTO) {
		return boardDAO.countBoardSearchResult(boardDTO);
	}
	
	// 寃뚯떆湲� 異붽�
	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}
	
	// 寃뚯떆湲� �닔�젙
	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}
	
	@Override
	public void viewsUpdate(BoardDTO boardVO) {
		boardDAO.viewsUpdate(boardVO);
	}
	
	// 寃뚯떆湲� �궘�젣
	@Override
	public void deleteBoard(BoardVO boardVO) {
		boardDAO.deleteBoard(boardVO);
	}
	
	// 寃뚯떆湲� 蹂닿린
	@Override
	public BoardDTO getBoard(Long boardId) {
		return boardDAO.getBoard(boardId);
	}
	
	@Override
	public BoardVO getBoardInfo(BoardVO boardVO) {
		return boardDAO.getBoardInfo(boardVO);
	}
	
	// 寃뚯떆湲� 紐⑸줉 蹂닿린
	@Override
	public List<BoardDTO> getBoardList(BoardDTO boardVO){
		return boardDAO.getBoardList(boardVO);
	}
	
	@Override
	public List<BoardDTO> getBoardFivePost(BoardDTO boardDTO) {
		return boardDAO.getBoardFivePost(boardDTO);
	}
	
	@Override
	public List<BoardVO> getBoardInfoList(BoardVO boardVO){
		return boardDAO.getBoardInfoList(boardVO);
	}
	
	/* ----------- 寃��깋湲곕뒫 ----------- */
	@Override
	public List<BoardDTO> communitySearch(BoardDTO boardDTO){
		return boardDAO.communitySearch(boardDTO);
	}
	
	/* ----------- 愿�由ъ옄 愿��젴 ----------- */
	// 愿�由ъ옄 泥댄겕
	@Override
	public boolean adminCheck(BoardVO boardVO) {
		boolean adminCheck = boardDAO.adminCheck(boardVO);
		if(!adminCheck) {
			boardDAO.adminY(boardVO);
		}else {
			boardDAO.adminN(boardVO);
		}
		return adminCheck;
	}
	
	@Override
	public void adminY(BoardVO boardVO) {
		boardDAO.adminY(boardVO);
	}
	
	@Override
	public void adminN(BoardVO boardVO) {
		boardDAO.adminN(boardVO);
	}
}
