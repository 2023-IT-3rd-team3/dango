package com.threeteam.dango.service.check;

import java.util.List;

import com.threeteam.dango.domain.check.CheckVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.domain.word.WordVO;

public interface CheckService {
	
	// 泥댄겕媛� �릺�뼱�엳�뒗吏� �솗�씤
	public CheckVO isCheck(CheckVO vo);
	// 泥댄겕 踰꾪듉�쓣 �겢由��뻽�쓣 �븣
	public void onCheck(CheckVO vo);
	// 泥댄겕 �릺�뼱�엳�뒗 �떒�뼱�쓽 泥댄겕 踰꾪듉�쓣 �겢由��뻽�쓣 �븣
	public void offCheck(CheckVO vo);
	// 泥댄겕�맂 �떒�뼱 由ъ뒪�듃瑜� 媛��졇�삤湲�
	public List<WordVO> getCheckList(UserVO userVO);
}