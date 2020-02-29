package com.sapient.weatherforecast.model;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAttribute;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class sun {
  @XmlAttribute(name="set")	
 private String set; 
  @XmlAttribute(name="rise")
 private String rise;
}
