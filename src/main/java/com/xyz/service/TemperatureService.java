package com.xyz.service;

import java.util.List;

import com.xyz.model.Temperature;
import com.xyz.model.UITemp;

public interface TemperatureService {
	public  List<UITemp> getTemperature(String city);
}
