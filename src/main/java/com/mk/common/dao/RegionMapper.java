package com.mk.common.dao;

import com.mk.common.entity.Region;

public interface RegionMapper
{
	/**
	 * 根据编号查询
	 * @param id
	 * @return
	 */
	public Region selectAreaById(String id);
	
}
