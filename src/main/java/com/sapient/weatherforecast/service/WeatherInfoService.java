/**
 * 
 */
package com.sapient.weatherforecast.service;

import org.springframework.stereotype.Service;

import com.sapient.weatherforecast.model.LocationInfo;
import com.sapient.weatherforecast.model.WeatherForecast;

/**
 * @author indiahiring
 *
 */
@Service
public interface WeatherInfoService {

	WeatherForecast getWeatherForecast(int geoId) throws Exception;
	int validateGeoId(String city, String country, int geoId) throws Exception;
	LocationInfo getLocation(int geoId) throws Exception;
}
