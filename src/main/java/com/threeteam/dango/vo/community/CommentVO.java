package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommentVO {

	private int commentId;
	private String commentMain;
	private String userId;
	private String boardId;
	private Date commentRegisterdate;
	private Date commentUpdatedate;
	
}