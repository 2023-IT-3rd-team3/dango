package com.threeteam.dango.mapper.word;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WordMapper {
	public String getTime();
}
