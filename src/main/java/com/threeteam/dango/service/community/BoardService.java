package com.threeteam.dango.service.community;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.BoardVO;

@Service
public interface BoardService {

	public void insertBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public BoardVO getBoard(BoardVO boardVO);
	public BoardVO getBoardInfo(BoardVO boardVO);
	public List<BoardVO> getBoardList(BoardVO boardVO);
	public List<BoardVO> getBoardInfoList(BoardVO boardVO);
	
	/* ----------- 검색기능 ----------- */
	public List<BoardVO> communitySearch(Map<String, String> boardVO);
	
	/* ----------- 관리자 관련 ----------- */
	// 관리자 체크
	public boolean adminCheck(BoardVO boardVO);
	// 관리자O
	public void adminY(BoardVO boardVO);
	// 관리자X
	public void adminN(BoardVO boardVO);
	
}
