package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.BoardVO;

@Service
public interface BoardService {

	public void insertBoard(BoardVO vo);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoardList(BoardVO vo);
}
