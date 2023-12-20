package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.community.BoardDAO;
import com.threeteam.dango.vo.community.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	// 게시글 추가
	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}
	
	// 게시글 수정
	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}
	
	// 게시글 삭제
	@Override
	public void deleteBoard(BoardVO boardVO) {
		boardDAO.deleteBoard(boardVO);
	}
	
	// 게시글 보기
	@Override
	public BoardVO getBoard(BoardVO boardVO) {
		return boardDAO.getBoard(boardVO);
	}
	
	// 게시글 목록 보기
	@Override
	public List<BoardVO> getBoardList(BoardVO boardVO){
		return boardDAO.getBoardList(boardVO);
	}
	
	/* ----------- 검색기능 ----------- */
	
	
	/* ----------- 관리자 관련 ----------- */
	// 관리자 체크
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
