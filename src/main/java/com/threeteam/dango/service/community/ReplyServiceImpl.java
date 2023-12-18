package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.community.ReplyDAO;
import com.threeteam.dango.vo.community.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyDAO replyDAO;
	
	@Override
	public void addReply(ReplyVO vo) {
		replyDAO.addReply(vo);
	}

	@Override
	public void deleteReply(ReplyVO vo) {
		replyDAO.deleteReply(vo);
	}

	@Override
	public ReplyVO getReply(ReplyVO vo) {
		return replyDAO.getReply(vo);
	}

	@Override
	public List<ReplyVO> getReplyList(ReplyVO vo) {
		return replyDAO.getReplyList(vo);
	}

}
