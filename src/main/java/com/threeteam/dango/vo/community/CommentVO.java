package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommentVO {

	private int commentid;
	private String commentmain;
	private String userid;
	private String boardid;
	private Date commentregisterdate;
	private Date commentupdatedate;
	
}