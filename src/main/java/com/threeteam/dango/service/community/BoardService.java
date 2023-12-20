package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.BoardVO;

@Service
public interface BoardService {

	public void insertBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public BoardVO getBoard(BoardVO boardVO);
	public List<BoardVO> getBoardList(BoardVO boardVO);
	
	// 관리자 체크
	public boolean adminCheck(BoardVO boardVO);
	
}
