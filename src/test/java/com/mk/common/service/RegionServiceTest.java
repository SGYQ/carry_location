package com.mk.common.service;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mk.common.entity.Region;


@RunWith( SpringJUnit4ClassRunner.class ) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class RegionServiceTest
{
	@Autowired
	RegionService regionService;
	
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testGetEntireAreaName()
	{
		Map<String,String> map = regionService.getEntireAreaName("00013000000000");
		
		String name = map.get("A")+map.get("B")+map.get("C");
		System.out.println( name );
	}

	@Test
	public void testGetRegionsBypid()
	{
		List<Region> list = 
				regionService.getRegionsByPid("00013000000000");
		
		Iterator<Region> iter = list.iterator();
		while( iter.hasNext() )
		{
			System.out.print(iter.next().getId());
		}
	}
}
