package com.threeteam.dango.mapper.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.vo.community.BoardVO;

@Mapper
public interface BoardMapper {

	public void insertBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public List<BoardVO> getBoardList(BoardVO boardVO);
	public BoardVO getBoard(BoardVO boardVO);
	public boolean adminCheck(BoardVO boardVO);
	public void adminY(BoardVO boardVO);
	public void adminN(BoardVO boardVO);
}
