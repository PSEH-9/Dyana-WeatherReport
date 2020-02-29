package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherForecast {

	private LocationVo location;
	private ForecastVo forecast;
	private meta meta;
	
}
