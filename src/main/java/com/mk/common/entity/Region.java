package com.mk.common.entity;

public class Region
{
	private String id;
	private String name;
	private String father_id;
	private String l_level;
	private int validity; //有效性，0：无效，1：有效，代表行政区域名称是否存在
	private String short_name;
	private String d_describe;
	private String list_num;

	public Region()
	{
	}


	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getFather_id()
	{
		return father_id;
	}

	public void setFather_id(String father_id)
	{
		this.father_id = father_id;
	}

	public String getL_level()
	{
		return l_level;
	}

	public void setL_level(String l_level)
	{
		this.l_level = l_level;
	}

	

	public int getValidity()
	{
		return validity;
	}


	public void setValidity(int validity)
	{
		this.validity = validity;
	}


	public String getShort_name()
	{
		return short_name;
	}


	public void setShort_name(String short_name)
	{
		this.short_name = short_name;
	}


	public String getD_describe()
	{
		return d_describe;
	}


	public void setD_describe(String d_describe)
	{
		this.d_describe = d_describe;
	}


	public String getList_num()
	{
		return list_num;
	}


	public void setList_num(String list_num)
	{
		this.list_num = list_num;
	}


	@Override
	public String toString()
	{
		return "Region [id=" + id + ", name=" + name + ", father_id=" + father_id + ", l_level=" + l_level
				+ ", validity=" + validity + ", short_name=" + short_name + ", d_describe=" + d_describe + ", list_num="
				+ list_num + "]";
	}

	
}
