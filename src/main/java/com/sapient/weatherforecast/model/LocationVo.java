package com.sapient.weatherforecast.model;

import lombok.Data;

@Data
public class LocationVo {
  private String name;
  private String country;
  private long timezone;
}
