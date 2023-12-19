package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ReplyVO {

	private String replyid;
	private String userid;
	private String commentid;
	private String replymain;
	private Date replyregisterdate;
	private Date replyupdatedate;
}