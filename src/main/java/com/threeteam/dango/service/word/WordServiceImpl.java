package com.threeteam.dango.service.word;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.word.WordDAO;
import com.threeteam.dango.domain.word.SentenceDTO;

@Service
@Primary
public class WordServiceImpl implements WordService {
	@Autowired
	WordDAO wordDAO;
	
	@Override
	public List<SentenceDTO> getSentenceList(Integer wordLevel) {
		return wordDAO.getSentenceList(wordLevel);
	}
}
