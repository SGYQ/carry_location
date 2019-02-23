package com.mk.common.dao;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mk.common.entity.Region;
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class RegionMapperTest
{
	@Autowired
	RegionMapper regionDao;
	
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testSelectAreaById()
	{
		Region re = regionDao.selectAreaById("00037160200000");
		Region re1 = regionDao.selectAreaById("12323");
		
		System.out.println(re);
		System.out.println(re1);
	}

}
