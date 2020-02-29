package com.sapient.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties (ignoreUnknown=true)
public class meta {
	@JsonProperty(value="lastupdate")
    @JacksonXmlProperty
	private String lastupdate;
	
	@JsonProperty(value="calctime")
    @JacksonXmlProperty
	private Long calctime;
	
	@JsonProperty(value="nextupdate")
    @JacksonXmlProperty
	private Long nextupdate;

}
