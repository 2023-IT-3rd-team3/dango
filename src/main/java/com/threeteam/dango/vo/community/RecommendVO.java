package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class RecommendVO {

	private Long recommendId;
	private Long boardId;
	private String userId;
	private Date recommendRegisterdate;
	private Date recommendUpdatedate;
}
