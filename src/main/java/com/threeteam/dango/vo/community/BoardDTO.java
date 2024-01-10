package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardDTO {
	private Long boardId;
	private String boardTitle;
	private String userId;
	private String boardMain;
	private int boardNotice;
	private int boardViews;
	private Date boardRegisterDate;
	private Date boardUpdateDate;
	private String searchCondition;
	private String searchKeyword;
	private int recommends;
	private String userProfile;
}