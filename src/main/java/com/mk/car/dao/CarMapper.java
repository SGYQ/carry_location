package com.mk.car.dao;

import java.util.List;

import com.mk.car.entity.Car;

public interface CarMapper
{
	/**
	 * 根据车牌号和车辆状态查询
	 * @param carno 车牌号，可以为空
	 * @param status 车辆状态(闲置、营运、退役，0，1，2)，可以为空
	 * @return 返回列表数据
	 */
	public List<Car> selectCars(String carno, int status);
	
	/**
	 * 修改车辆信息
	 * @param car
	 * @return
	 */
	public int updateCar(Car car) throws Exception;
	
	/**
	 * 修改车辆状态
	 * @param id 车俩编号
	 * @param status
	 * @return
	 */
	public int updateCarStatusById(int id, int status) throws Exception;
	
	/**
	 * 添加信息
	 * @param car
	 * @return
	 * @throws Exception
	 */
	public int insertCar(Car car) throws Exception;
}
