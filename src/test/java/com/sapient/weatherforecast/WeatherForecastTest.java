/**
 * 
 */
package com.sapient.weatherforecast;

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jooq.SpringTransactionProvider;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import com.sapient.weatherforecast.controller.WeatherInfoController;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author indiahiring
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(WeatherInfoController.class)
public class WeatherForecastTest {

	@InjectMocks
	private WeatherInfoController info;
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getWeatherForecast() throws Exception 
	{
	  mvc.perform( MockMvcRequestBuilders
	      .put("/weatherinfo/{geoId}",4517009)
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.location.name").exists())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.location.name").isNotEmpty());
	}
	
	@Test
	public void getTest() throws Exception 
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/api/test")
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk());
	  
	}
}
