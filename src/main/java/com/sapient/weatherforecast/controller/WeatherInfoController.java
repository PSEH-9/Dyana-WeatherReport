/**
 * 
 */
package com.sapient.weatherforecast.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weatherforecast.model.WeatherForecast;
import com.sapient.weatherforecast.model.WeatherResponse;
import com.sapient.weatherforecast.service.WeatherInfoService;

/**
 * @author indiahiring
 *
 */
@RestController
@CrossOrigin
public class WeatherInfoController {


	private final Logger logger = Logger.getLogger(WeatherInfoController.class);

	@Autowired(required=true)
	WeatherInfoService weatherInfoService;

	@GetMapping("/api/test")
	public String test() {
		return "Just test!!";	
	}
	
	/*Input is GeoId
	 *Based on GeoId, fetch country and city
	 *Then invoke the rest client*/
	
	@GetMapping("/weather/{geoId}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<WeatherForecast> getWeatherForecast(@PathVariable int geoId) {
		logger.info("getWeatherForecast for geoId: " + geoId);
				
		try {
			return new ResponseEntity<>(weatherInfoService.getWeatherForecast(geoId), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/weatherinfo/{geoId}", method=RequestMethod.GET, produces="application/json")
	public WeatherResponse getWeatherJson(@PathVariable int geoId) {
		logger.info("getWeatherForecast for geoId: " + geoId);			
		try {
			return weatherInfoService.getWeatherJson(geoId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
