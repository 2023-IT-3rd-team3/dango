package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommentDTO {
	private Long commentId;
	private String commentMain;
	private String userId;
	private Long boardId;
	private String commentRegisterDate;
	private String commentUpdateDate;
	private String userProfile;
}