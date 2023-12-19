package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.ReplyVO;

@Service
public interface ReplyService {
	
	public void addReply(ReplyVO replyVO);
	public void deleteReply(ReplyVO replyVO);
	public ReplyVO getReply(ReplyVO replyVO);
	public List<ReplyVO> getReplyList(ReplyVO replyVO);
}
