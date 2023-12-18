package com.threeteam.dango.service.word;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.domain.word.SentenceDTO;

@Service
public interface WordService {
	public List<SentenceDTO> getSentenceList(Integer wordLevel, String userId);
}
