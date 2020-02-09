/**
 * 
 */
package com.sapient.weatherforecast.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.weatherforecast.controller.ControllerConfiguration;
import com.sapient.weatherforecast.model.LocationInfo;
import com.sapient.weatherforecast.model.WeatherForecast;
import com.sapient.weatherforecast.service.WeatherInfoService;

/**
 * @author indiahiring
 *
 */
@Service
public class WeatherInfoServiceImpl implements WeatherInfoService{

	private final Logger logger = Logger.getLogger(WeatherInfoServiceImpl.class);

	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@Override
	public List<WeatherForecast> getWeatherForecast(int geoId) throws Exception {
		logger.info("In getWeatherForecast");
		final String url="https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.set("Content-Type", "application/xml");
		String xmlString=restTemplate.getForObject(url,String.class);		
		logger.info(xmlString);
		return null;
	}


	@Override
	public int validateGeoId(String city, String country, int geoId) throws Exception{
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public LocationInfo getLocation(int geoId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
