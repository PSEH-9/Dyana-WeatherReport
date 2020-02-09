/**
 * 
 */
package com.sapient.weatherforecast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author indiahiring
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {

	
	private int status;
	private String message;
	
}
