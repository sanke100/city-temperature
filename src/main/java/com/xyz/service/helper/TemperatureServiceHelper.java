package com.xyz.service.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.xyz.model.ListProp;
import com.xyz.model.Temperature;
import com.xyz.model.UITemp;

public class TemperatureServiceHelper {

	public static  List<UITemp> getTemperature(String city) {
		String apiURL  = "https://samples.openweathermap.org/data/2.5/forecast/daily?q= "+city+"&appid=d2929e9483efc82c82c32ee7%20e02d563e";
		RestTemplate rt = new RestTemplate();
		Temperature apiResponse = rt.getForObject(apiURL, Temperature.class);
		
		return  getThreeDaysListOfTemp(apiResponse.getList());
	}

	public static List<UITemp> getThreeDaysListOfTemp(List<ListProp> list) {
		List<UITemp> uiTempList = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			ListProp lp = list.get(i);
			UITemp uiTemp = new UITemp();
			uiTemp.setDate(new Date(lp.getDt()));
			uiTemp.setCondition(lp.getWeather().get(0).getMain());
			int min = (int) (lp.getTemp().getMin()  -273.15);
			int max = (int) (lp.getTemp().getMax() -273.15);
			uiTemp.setMin(min);
			uiTemp.setMax(max);
			uiTemp.setSuggestion( max > 40 ? "Use sunscreen lotion": uiTemp.getCondition().equals("Rain")? "Carry Umbrella": "No suggestion");
			uiTempList.add(uiTemp);
		}
		return uiTempList;
	}
}
