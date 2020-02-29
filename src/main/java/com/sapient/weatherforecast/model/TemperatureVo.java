package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class TemperatureVo {

	@JsonProperty(value="unit")
	@JacksonXmlProperty(isAttribute=true)
	private String unit;
	
	@JsonProperty(value="value")
	@JacksonXmlProperty(isAttribute=true)
	private double value;
	
	@JsonProperty(value="min")
	@JacksonXmlProperty(isAttribute=true)
	private double min;
	
	@JsonProperty(value="max")
	@JacksonXmlProperty(isAttribute=true)
	private double max;
	
}
