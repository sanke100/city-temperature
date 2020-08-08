package com.xyz.service.helper;

import java.util.List;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.xyz.model.Temperature;

public class TemperatureServiceHelper {

	public static Temperature getTemperature(String city) {
		String apiURL  = "https://samples.openweathermap.org/data/2.5/forecast?q= "+city+"&appid=d2929e9483efc82c82c32ee7%20e02d563e";
		RestTemplate rt = new RestTemplate();
		Temperature apiResponse = rt.getForObject(apiURL, Temperature.class);
		return apiResponse;
	}

}
