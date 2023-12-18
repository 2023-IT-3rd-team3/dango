package com.threeteam.dango.mapper.word;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.threeteam.dango.domain.word.SentenceDTO;
import com.threeteam.dango.domain.word.WordVO;

@Mapper
public interface WordMapper {
	public List<SentenceDTO> getSentenceList(Integer wordLevel);
	public WordVO getWord();
}
