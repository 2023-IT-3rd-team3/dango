package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardVO {

	private int boardid;
	private String boardtitle;
	private String userid;
	private String boardmain;
	private String boardnotice;
	private Date boardregisterdate;
	private Date boardupdatedate;
	private String searchCondition;
	private String searchKeyword;
}