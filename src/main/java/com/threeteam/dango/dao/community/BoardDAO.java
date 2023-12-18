package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.vo.community.BoardVO;

@Repository("BoardDAO")
public class BoardDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL 명령어
	// Board
	private final String BOARD_INSERT="insert into T_BOARD(boardid, boardtitle, userid, boardmain) values(?, ?, ?, ?)";
	private final String BOARD_UPDATE="update board set boardtitle=?, boardmain=? where boardid=?";
	private final String BOARD_DELETE="delete from T_BOARD where boardid=?";
	private final String BOARD_GET="select * from T_BAROD where boardid=?";
	private final String BOARD_LIST="select * from T_BOARD order by boardid desc";
	
	
	/*--------------------------------------------------------------------------*/
	
	// 검색 명령어
	// 제목으로 검색
	private final String BOARD_LIST_T=
			"select * from T_BOARD where boardtitle like '%'||?||'%' order by boardid desc";
	// 유저ID로 검색
	private final String BOARD_LIST_C=
			"select * from T_BOARD where userid '%'||?||'%' order by boardid desc";
		
	public void insertBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_INSERT, vo.getBoardtitle(), vo.getUserid(), vo.getBoardmain());
	}
	
	public void updateBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_UPDATE, vo.getBoardtitle(), vo.getBoardmain());
	}
	
	public void deleteBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_DELETE);
	}
	
	
	public BoardVO getBoard(BoardVO vo) {
		
		return null;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		return null;
	}
}