/**
 * 
 */
package com.sapient.weatherforecast.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.weatherforecast.model.LocationInfo;
import com.sapient.weatherforecast.model.WeatherForecast;
import com.sapient.weatherforecast.model.WeatherResponse;

/**
 * @author indiahiring
 *
 */
@Service
public interface WeatherInfoService {

	WeatherForecast getWeatherForecast(int geoId) throws Exception;
	int validateGeoId(String city, String country, int geoId) throws Exception;
	LocationInfo getLocation(int geoId) throws Exception;
	
	WeatherResponse getWeatherJson(int geoId) throws Exception;
}
