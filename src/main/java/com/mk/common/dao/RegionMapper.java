package com.mk.common.dao;

import java.util.List;

import com.mk.common.entity.Region;

public interface RegionMapper
{
	/**
	 * 根据编号查询
	 * @param id
	 * @return
	 */
	public Region selectAreaById(String id);
	
	/**
	 * 根据 父类编号查询
	 * @param pid
	 * @return
	 */
	public List<Region> selectRegionsByPid(String pid);
}
