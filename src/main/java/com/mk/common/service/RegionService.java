package com.mk.common.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.common.dao.RegionMapper;
import com.mk.common.entity.Region;

@Service
public class RegionService
{
	@Autowired
	private RegionMapper regionDao;
	
	/**
	 * 根据一个区划编号获取完整名称
	 * @param region_id
	 * @return
	 */
	public Map<String,String> getEntireAreaName(String region_id)
	{
		Map<String,String> map = new HashMap<>();
		
		String id = region_id;
		do {
			Region region = regionDao.selectAreaById(id);
			if( region==null ) //查询不到即跳出循环
				break;
			
			map.put(region.getL_level(), region.getName()); //行政等级，名称
			//获取上级的行政单位编号
			id = region.getFather_id();
		} while( true );
		
		return map;
	}
}
