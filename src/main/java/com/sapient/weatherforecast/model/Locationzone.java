package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Locationzone {

	@JacksonXmlProperty(isAttribute=true)
	private String geobaseid;
	@JacksonXmlProperty(isAttribute=true)
	private String geobase;
	@JacksonXmlProperty(isAttribute=true)
	private String longitude;
	@JacksonXmlProperty(isAttribute=true)
	private String latitude;
	@JacksonXmlProperty(isAttribute=true)
	private String altitude;
}
