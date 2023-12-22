package com.threeteam.dango.service.recent;

import java.util.List;

import com.threeteam.dango.domain.recent.RecentVO;
import com.threeteam.dango.domain.word.WordVO;

public interface RecentService {
	
	public boolean isRecent(RecentVO vo);
	public void setRecent(RecentVO vo);
	public void updateRecent(RecentVO vo);
	public WordVO getRecent(RecentVO vo);
	public List<WordVO> getRecentList(RecentVO vo);
}
