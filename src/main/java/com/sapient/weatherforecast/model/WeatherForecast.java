package com.sapient.weatherforecast.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class WeatherForecast {

	
	String timeTo;
	String timeFrom;
	String message;
	int day;
	
}
