package com.threeteam.dango.domain.word;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class WordVO {
	private Long wordId;
	private String word;
	private String furigana;
	private String mean;
	private Integer level;
	private Date wordRegisterDate;
	private Date wordUpdateDate;
}
