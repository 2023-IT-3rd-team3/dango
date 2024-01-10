package com.threeteam.dango.service.community;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.BoardDTO;
import com.threeteam.dango.vo.community.BoardVO;

@Service
public interface BoardService {

	public void insertBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void viewsUpdate(BoardDTO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public BoardDTO getBoard(Long boardId);
	public BoardVO getBoardInfo(BoardVO boardVO);
	public List<BoardDTO> getBoardList(BoardDTO boardVO);
	public List<BoardVO> getBoardInfoList(BoardVO boardVO);
	
	/* ----------- 寃��깋湲곕뒫 ----------- */
	public List<BoardDTO> communitySearch(String keyword);
	
	/* ----------- 愿�由ъ옄 愿��젴 ----------- */
	// 愿�由ъ옄 泥댄겕
	public boolean adminCheck(BoardVO boardVO);
	// 愿�由ъ옄O
	public void adminY(BoardVO boardVO);
	// 愿�由ъ옄X
	public void adminN(BoardVO boardVO);
}
