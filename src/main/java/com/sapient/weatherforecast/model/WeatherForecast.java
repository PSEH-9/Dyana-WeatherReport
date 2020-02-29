package com.sapient.weatherforecast.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherForecast {

	@XmlElement(name="location")
	private LocationVo location;
	@XmlElement(name="forecast")
	private ForecastVo forecast;
	@XmlElement(name="meta")
	private meta meta;
	@XmlElement(name="sun")
	private sun sun; 
	@XmlElement(name="credit")
	private credit credit;
	
}
