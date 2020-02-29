package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherResponse {

	private WeatherForecast weatherdata;
}
