package com.sapient.weatherforecast.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class LocationVo {
	
  @JacksonXmlProperty	
  private String name;
  @JacksonXmlProperty
  private String country;
  @JacksonXmlProperty
  private String timezone;
  @JacksonXmlProperty
  private String type;
  @JacksonXmlProperty
  @JacksonXmlElementWrapper(localName = "location")
  private Locationzone location;
}
