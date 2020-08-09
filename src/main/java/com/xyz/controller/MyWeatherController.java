package com.xyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.model.Temperature;
import com.xyz.model.UITemp;
import com.xyz.service.TemperatureService;

@RestController
public class MyWeatherController {
	
	@Autowired
	TemperatureService temperatureService;

	@RequestMapping("temperature/{city}")
	public  List<UITemp> getTemperature(@PathVariable String city) {
		return temperatureService.getTemperature(city);
	}
}
