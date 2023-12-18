package com.threeteam.dango.domain.word;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
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
	
	public Long getWordId() {
		return wordId;
	}
	public void setWordId(Long wordId) {
		this.wordId = wordId;
	}
	public String getWordWord() {
		return wordWord;
	}
	public void setWordWord(String wordWord) {
		this.wordWord = wordWord;
	}
	public String getWordFurigana() {
		return wordFurigana;
	}
	public void setWordFurigana(String wordFurigana) {
		this.wordFurigana = wordFurigana;
	}
	public String getWordMean() {
		return wordMean;
	}
	public void setWordMean(String wordMean) {
		this.wordMean = wordMean;
	}
	public Integer getWordLevel() {
		return wordLevel;
	}
	public void setWordLevel(Integer wordLevel) {
		this.wordLevel = wordLevel;
	}
	public String getExFrontJp() {
		return exFrontJp;
	}
	public void setExFrontJp(String exFrontJp) {
		this.exFrontJp = exFrontJp;
	}
	public String getExBackJp() {
		return exBackJp;
	}
	public void setExBackJp(String exBackJp) {
		this.exBackJp = exBackJp;
	}
	public String getExFrontKr() {
		return exFrontKr;
	}
	public void setExFrontKr(String exFrontKr) {
		this.exFrontKr = exFrontKr;
	}
	public String getExBackKr() {
		return exBackKr;
	}
	public void setExBackKr(String exBackKr) {
		this.exBackKr = exBackKr;
	}
	public Integer getWrongNum() {
		return wrongNum;
	}
	public void setWrongNum(Integer wrongNum) {
		this.wrongNum = wrongNum;
	}
}