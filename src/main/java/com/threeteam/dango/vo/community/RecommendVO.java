package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class RecommendVO {

	private String recommendId;
	private String boardId;
	private String userid;
	private Date recommendRegisterdate;
	private Date recommendUpdatedate;
}
