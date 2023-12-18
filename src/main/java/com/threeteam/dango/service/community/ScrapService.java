package com.threeteam.dango.service.community;

import java.util.List;

import org.springframework.stereotype.Service;

import com.threeteam.dango.vo.community.ScrapVO;

@Service
public interface ScrapService {

	public void addScrap(ScrapVO vo);
	public void deleteScrap(ScrapVO vo);
}
