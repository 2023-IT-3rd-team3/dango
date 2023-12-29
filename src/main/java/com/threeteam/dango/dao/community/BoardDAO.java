package com.threeteam.dango.dao.community;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.mapper.community.BoardMapper;
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
		return boardMapper.getBoard(boardVO);
	}
	public BoardVO getBoardInfo(BoardVO boardVO) {
		return boardMapper.getBoardInfo(boardVO);
	}
	public List<BoardVO> getBoardList(BoardVO boardVO) {
		return boardMapper.getBoardList(boardVO);
	}

	public List<BoardVO> getBoardInfoList(BoardVO boardVO) {
		return boardMapper.getBoardInfoList(boardVO);
	}
	
	public List<BoardVO> communitySearch(Map<String, String> boardVO) {
		 return boardMapper.communitySearch(boardVO);
	}
	
	public boolean adminCheck(BoardVO boardVO) {
		return boardMapper.adminCheck(boardVO);
	}
	public void adminY(BoardVO boardVO) {
		boardMapper.adminY(boardVO);
	}
	public void adminN(BoardVO boardVO) {
		boardMapper.adminN(boardVO);
	}
	
}