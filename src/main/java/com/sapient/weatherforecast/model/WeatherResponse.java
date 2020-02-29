package com.sapient.weatherforecast.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JacksonXmlRootElement(localName = "weatherdata")
public class WeatherResponse {
	
	@JsonProperty(value="location")
	@JacksonXmlElementWrapper(localName = "location", useWrapping=true)	
	@JacksonXmlProperty(localName="location")
	private LocationVo location;
	//@JacksonXmlProperty(localName="forecast")
	//private ForecastVo forecast ;
	
	@JsonProperty(value="time")
	@JacksonXmlElementWrapper(localName = "forecast")
	@JacksonXmlProperty(localName="time")
	private List<TimeVo> time;
	
	@JsonProperty(value="meta")
	@JacksonXmlProperty(localName="meta")
	private meta meta;
	
	@JsonProperty(value="sun")
	@JacksonXmlProperty(localName="sun")
	private sun sun; 
	
	@JsonProperty(value="credit")
	@JacksonXmlProperty(localName="credit")
	private credit credit;
}
