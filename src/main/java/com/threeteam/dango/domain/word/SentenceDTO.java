package com.threeteam.dango.domain.word;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data
@NoArgsConstructor
public class SentenceDTO {
	private Long wordId;
	private String wordWord;
	private String wordFurigana;
	private String wordMean;
	private Integer wordLevel;
	private String exFrontJp;
	private String exBackJp;
	private String exFrontKr;
	private String exBackKr;
	private Integer wrongNum;
	private Long wrongId;
}