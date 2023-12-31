package com.threeteam.dango.mapper.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.vo.community.BoardDTO;
import com.threeteam.dango.vo.community.BoardVO;

@Mapper
public interface BoardMapper {

	public BoardVO getBoard(Long board);
	public BoardVO getBoardInfo(BoardVO boardVO);
	public List<BoardDTO> getBoardList(BoardDTO boardDTO);
	public List<BoardVO> getBoardInfoList(BoardVO boardVO);
	public void insertBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void viewsUpdate(BoardVO boardVO);

	/* ----------- 寃��깋湲곕뒫 ----------- */
	public List<BoardDTO> communitySearch(String keyword);
	
	/* --------- 愿�由ъ옄 愿��젴 --------- */
	public boolean adminCheck(BoardVO boardVO);
	public void adminY(BoardVO boardVO);
	public void adminN(BoardVO boardVO);
}