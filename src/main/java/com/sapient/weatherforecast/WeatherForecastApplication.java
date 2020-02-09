package com.sapient.weatherforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.sapient.weatherforecast")
public class WeatherForecastApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WeatherForecastApplication.class, args);
    }
}
