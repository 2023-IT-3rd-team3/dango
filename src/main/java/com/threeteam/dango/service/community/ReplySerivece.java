package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.ReplyVO;

@Service
public interface ReplySerivece {
	
	public void addReply(ReplyVO vo);
	public void deleteReply(ReplyVO vo);
	public ReplyVO getReply(ReplyVO vo);
	public List<ReplyVO> getReplyList(ReplyVO vo);
}
