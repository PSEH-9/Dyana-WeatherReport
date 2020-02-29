package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherForecast {

	private LocationVo location;
	private ForecastVo forecast;
	
}
