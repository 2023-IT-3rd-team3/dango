package com.threeteam.dango.domain.check;

import java.util.List;

import com.threeteam.dango.domain.word.WordVO;

public interface CheckService {
	
	// 체크가 되어있는지 확인
	public boolean isCheck(CheckVO vo);
	// 체크 버튼을 클릭했을 때
	public void onCheck(CheckVO vo);
	// 체크 되어있는 단어의 체크 버튼을 클릭했을 때
	public void offCheck(CheckVO vo);
	// 체크된 단어 정보를 가져오기
	public WordVO getCheck(CheckVO vo);
	// 체크된 단어 리스트를 가져오기
	public List<WordVO> getCheckList(CheckVO vo);
}