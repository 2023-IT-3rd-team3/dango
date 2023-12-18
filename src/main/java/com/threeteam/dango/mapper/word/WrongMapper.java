package com.threeteam.dango.mapper.word;

import java.util.List;

import com.threeteam.dango.domain.word.SentenceDTO;
import com.threeteam.dango.domain.word.WrongVO;

public interface WrongMapper {
	public List<SentenceDTO> selectAllByUserId(String userId);
	public WrongVO selectByUserIdWordId(WrongVO wrongVO);
	public void insert(WrongVO wrongVO);
	public void update(WrongVO wrongVO);
	public void delete(Long wrongId);
}
