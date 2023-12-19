package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.mapper.community.BoardMapper;
import com.threeteam.dango.mapper.community.BoardRowMapper;
import com.threeteam.dango.vo.community.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	BoardMapper boardMapper;
	
	public void insertBoard(BoardVO boardVO) {
		boardMapper.insertBoard(boardVO);
	}
	public void updateBoard(BoardVO boardVO) {
		boardMapper.updateBoard(boardVO);
	}
	public void deleteBoard(BoardVO boardVO) {
		boardMapper.deleteBoard(boardVO);
	}
	public BoardVO getBoard(BoardVO boardVO) {
		boardMapper.getBoard(boardVO);
	}
	public List<BoardVO> getBoardList(String boardId) {
		boardMapper.getBoardList(boardId);
	}
}