package com.threeteam.dango.service.recent;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.dao.recent.RecentDAO;
import com.threeteam.dango.domain.recent.RecentVO;
import com.threeteam.dango.domain.user.UserVO;
import com.threeteam.dango.domain.word.WordVO;

@Service("recentService")
public class RecentServiceImpl implements RecentService {

	@Override
	public boolean isRecent(RecentVO vo) {
		boolean isRecent = RecentDAO.isRecent(vo);
		if(!isRecent) {
			RecentDAO.setRecent(vo);
		}else {
			RecentDAO.updateRecent(vo);
		}
		return !isRecent;
	}

	@Override
	public void setRecent(RecentVO vo) {
		RecentDAO.setRecent(vo);
	}

	@Override
	public void updateRecent(RecentVO vo) {
		RecentDAO.updateRecent(vo);
	}

	@Override
	public List<WordVO> getRecentList(UserVO userVO) {
		return RecentDAO.getRecentList(userVO);
	}

}
