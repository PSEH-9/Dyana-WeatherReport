package com.sapient.weatherforecast.model;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class TimeVo {

	@XmlAttribute(name="from")
	 private String from;
	@XmlAttribute(name="to")
	 private String to;
	@XmlElement (name="temperature")
	 private TemperatureVo temperature;
	 
	//private windDirection 
	//number="802" name="scattered clouds" var="03n"/>
	/*<precipitation/>
	<windDirection deg="291" code="WNW" name="West-northwest"/>
	<windSpeed mps="5.35" unit="m/s" name="Gentle Breeze"/>
	<temperature unit="kelvin" value="265.89" min="265.22" max="265.89"/>
	<feels_like value="259.21" unit="kelvin"/>
	<pressure unit="hPa" value="1022"/>
	<humidity value="91" unit="%"/>
	<clouds value="scattered clouds" all="40" unit="%"/>*/
}
