package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class RecommendVO {

	private String recommendid;
	private String boardid;
	private String userid;
	private Date recommendregisterdate;
	private Date recommendupdatedate;
}
