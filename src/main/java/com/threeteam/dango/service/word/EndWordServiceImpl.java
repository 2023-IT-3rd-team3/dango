package com.threeteam.dango.service.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.word.EndWordDAO;
import com.threeteam.dango.domain.word.EndWordVO;

@Service
public class EndWordServiceImpl implements EndWordService {
	@Autowired
	EndWordDAO endWordDAO;
	
	@Override
	public EndWordVO getEndWordByUserIdWordId(EndWordVO endWordVO) {
		// TODO Auto-generated method stub
		return endWordDAO.getEndWordByUserIdWordId(endWordVO);
	}
	
	@Override
	public void addEndWord(EndWordVO endWordVO) {
		// TODO Auto-generated method stub
		endWordDAO.addEndWord(endWordVO);
	}
}