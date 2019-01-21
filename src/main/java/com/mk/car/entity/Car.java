package com.mk.car.entity;

import java.util.Date;

public class Car
{
	private int id;
	private String carno;
	private double maxload; //最大载重
	private double loading;
	private int status; //--车辆状态, 闲置、营运、退役，0，1，2
	
	private Date service_date; //服役日期
	private int carry_counts; //运输次数
	private double kilometers;//运输里程
	private String region_id; //区划编号，当前位置
	private String address; //地址， 当前位置
	
	public Car()
	{
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCarno()
	{
		return carno;
	}

	public void setCarno(String carno)
	{
		this.carno = carno;
	}

	public double getMaxload()
	{
		return maxload;
	}

	public void setMaxload(double maxload)
	{
		this.maxload = maxload;
	}

	public double getLoading()
	{
		return loading;
	}

	public void setLoading(double loading)
	{
		this.loading = loading;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public Date getService_date()
	{
		return service_date;
	}

	public void setService_date(Date service_date)
	{
		this.service_date = service_date;
	}

	public int getCarry_counts()
	{
		return carry_counts;
	}

	public void setCarry_counts(int carry_counts)
	{
		this.carry_counts = carry_counts;
	}

	public double getKilometers()
	{
		return kilometers;
	}

	public void setKilometers(double kilometers)
	{
		this.kilometers = kilometers;
	}

	public String getRegion_id()
	{
		return region_id;
	}

	public void setRegion_id(String region_id)
	{
		this.region_id = region_id;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Car [id=" + id + ", carno=" + carno + ", maxload=" + maxload + ", loading=" + loading + ", status="
				+ status + ", service_date=" + service_date + ", carry_counts=" + carry_counts + ", kilometers="
				+ kilometers + ", region_id=" + region_id + ", address=" + address + "]";
	}
	
	
}
