/**
 * 
 */
package com.sapient.weatherforecast.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * @author indiahiring
 *
 */
@XmlRootElement
@Data
public class weatherdata {

	@XmlElement
	private String location;
	
	@XmlElement
	private String meta;
	
	@XmlElement
	private String forecast;
	
}
