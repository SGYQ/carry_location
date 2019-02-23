package com.mk.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.car.dao.CarMapper;

@Service
public class CarService
{
	@Autowired
	CarMapper carMapper;
	
	
}
