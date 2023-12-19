package com.threeteam.dango.service.check;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.check.CheckDAO;
import com.threeteam.dango.domain.check.CheckService;
import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.word.WordVO;

@Service("checkService")
public class CheckServiceImpl implements CheckService {

	@Autowired
	private CheckDAO checkDAO;
	
	@Override
	public boolean isCheck(CheckVO vo) {
		boolean isChecked = checkDAO.isCheck(vo);
		if(!isChecked) {
			checkDAO.onCheck(vo);
		}else {
			checkDAO.offCheck(vo);
		}
		return !isChecked;
	}

	@Override
	public void onCheck(CheckVO vo) {
		checkDAO.onCheck(vo);
	}

	@Override
	public void offCheck(CheckVO vo) {
		checkDAO.offCheck(vo);
	}

	@Override
	public WordVO getCheck(CheckVO vo) {
		return (WordVO)checkDAO.getCheck(vo);
	}

	@Override
	public List<WordVO> getCheckList(CheckVO vo) {
		return checkDAO.getCheckList(vo);
	}

}
