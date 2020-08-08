package com.xyz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xyz.model.Temperature;
import com.xyz.service.TemperatureService;
import com.xyz.service.helper.TemperatureServiceHelper;

@Service
public class TemperatureServiceImpl implements TemperatureService {

	@Override
	public Temperature getTemperature(String city) {
		return TemperatureServiceHelper.getTemperature(city);
	}

}
