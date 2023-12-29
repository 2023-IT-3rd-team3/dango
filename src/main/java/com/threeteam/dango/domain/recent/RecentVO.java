package com.threeteam.dango.domain.recent;

import java.sql.Date;

import lombok.Data;

@Data
public class RecentVO {
	
	private String userId;
	private Long wordId;
	private Date recentUpdateDate;
}
