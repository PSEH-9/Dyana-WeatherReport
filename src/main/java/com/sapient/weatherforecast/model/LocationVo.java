package com.sapient.weatherforecast.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class LocationVo {
	
  @XmlAttribute(name="name")	
  private String name;
  @XmlAttribute	(name="country")
  private String country;
  @XmlAttribute	(name="timezone")
  private long timezone;
  @XmlElement(name="location")
  private Locationzone location;
}
