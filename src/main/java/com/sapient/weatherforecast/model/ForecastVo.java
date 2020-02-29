package com.sapient.weatherforecast.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class ForecastVo {
  @XmlElement(name="time")	
  private List<TimeVo> time;
}
