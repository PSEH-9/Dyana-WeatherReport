package com.sapient.weatherforecast.model;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAttribute;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class sun {
	
	@JsonProperty(value="set")
	@JacksonXmlProperty(isAttribute=true)
 private String set; 
	@JsonProperty(value="rise")
	@JacksonXmlProperty(isAttribute=true)
 private String rise;
}
