package com.threeteam.dango.vo.community;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ScrapVO {

	private String scrapid;
	private Date scrapregisterdate;
	private Date scrapupdatedate;
	
}
