/**
 * 
 */
package com.sapient.weatherforecast.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sapient.weatherforecast.controller.ControllerConfiguration;
import com.sapient.weatherforecast.model.LocationInfo;
import com.sapient.weatherforecast.model.WeatherForecast;
import com.sapient.weatherforecast.model.WeatherResponse;
import com.sapient.weatherforecast.service.WeatherInfoService;

/**
 * @author indiahiring
 *
 */
@Service
public class WeatherInfoServiceImpl implements WeatherInfoService{

	private final Logger logger = Logger.getLogger(WeatherInfoServiceImpl.class);
	final String url="http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e";
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@Override
	public List<WeatherForecast> getWeatherForecast(int geoId) throws Exception {
		logger.info("In getWeatherForecast");
		Map<String, String> params= new HashMap<>();
		params.put("q", "London,us");
		params.put("mode", "xml");
		params.put("appid", "b6907d289e10d714a6e88b30761fae22");
		
		
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.set("Content-Type", "application/xml");
		String xmlString=restTemplate.getForObject("http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e",String.class, params );		
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


	@Override
	public WeatherResponse getWeatherJson(int geoId) throws Exception {
		logger.info("In getWeatherJson");
		Map<String, String> params= new HashMap<>();
		params.put("q", "London,us");
		params.put("mode", "xml");
		params.put("appid", "b6907d289e10d714a6e88b30761fae22");
		//https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22
		//http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e
		//api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e
				
		UriComponentsBuilder builder = UriComponentsBuilder
		    .fromUriString("http://api.openweathermap.org/data/2.5/forecast")
		    .queryParam("q", "London,us")
		    .queryParam("mode", "xml")
		    .queryParam("appid", "d2929e9483efc82c82c32ee7e02d563e");
		
		WeatherResponse respone=restTemplate.getForObject(builder.toUriString(), WeatherResponse.class);		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
			System.out.println(mapper.writeValueAsString(respone));
			logger.info(respone);
		return respone;
	}

}
