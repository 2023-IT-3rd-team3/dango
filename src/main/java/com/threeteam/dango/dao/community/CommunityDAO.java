package com.threeteam.dango.dao.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.threeteam.dango.service.community.CommunityVO;

@Repository("boardDAO")
public class CommunityDAO {

	// Board
	
	
	// SQL 명령어
	private final String BOARD_INSERT="insert into T_BOARD(boardtitle, userid, boardmain) values(?, ?, ?)";
	private final String BOARD_UPDATE="update board set boardtitle=?, boardmain=? where seq=?";
	private final String BOARD_DELETE="delete from T_BOARD where seq=?";
	private final String BOARD_GET="select * from T_BAROD where seq=?";
	private final String BOARD_LIST="select * from T_BOARD order by seq desc";
	
	// 검색 명령어
	private final String BOARD_LIST_T=
			"select * from T_BOARD where boardtitle like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C=
			"select * from T_BOARD where boardtitle boardmain '%'||?||'%' order by seq desc";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertBoard(CommunityVO vo) {
		jdbcTemplate.update(BOARD_INSERT, vo.getBoardtitle(), vo.getUserid(), vo.getBoardmain());
	}
	
	public void updateBoard(CommunityVO vo) {
		jdbcTemplate.update(BOARD_UPDATE, vo.getBoardtitle(), vo.getBoardmain());
	}
	
	public void deleteBoard(CommunityVO vo) {
		jdbcTemplate.update(BOARD_DELETE);
	}
	
	
	public CommunityVO getBoard(CommunityVO vo) {
		
		return null;
	}
	
	public List<CommunityVO> getBoardList(CommunityVO vo){
		return null;
	}
	
	
	// Comment
	public void addComment(CommunityVO vo) {
		
	}
	
	public void deleteComment(CommunityVO vo) {
		
	}
	
	// Reply
	public void addReply(CommunityVO vo) {
		
	}
	
	public void deleteReply(CommunityVO vo) {
		
	}
	
	// Scrap
	public void addScrap(CommunityVO vo) {
		
	}
	
	public void deleteScrap(CommunityVO vo) {
		
	}
	
	// Recommend
	public void plusRecommend(CommunityVO vo) {
		
	}
	
	public void minusRecommend(CommunityVO vo) {
		
	}
}