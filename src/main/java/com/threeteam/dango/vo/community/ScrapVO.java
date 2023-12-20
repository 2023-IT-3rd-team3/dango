package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ScrapVO {

	private String scrapId;
	private Date scrapRegisterdate;
	private Date scrapUpdatedate;
	
}
