package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("Select sysdate From daul")
	public String getTime();
	
	public String getTime2();
	
}
