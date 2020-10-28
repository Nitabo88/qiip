package com.qiip.models;

import com.qiip.models.builders.TiempoRealBuilder;

public class TiempoReal {
  String token;
  String lat;
  String lng;
  String alt;
  String ozone;
  String dt;

  public TiempoReal(TiempoRealBuilder tiempoRealBuilder) {
    this.token = tiempoRealBuilder.getToken();
    this.lat = tiempoRealBuilder.getLat();
    this.lng = tiempoRealBuilder.getLng();
    this.alt = tiempoRealBuilder.getAlt();
    this.ozone = tiempoRealBuilder.getOzone();
    this.dt = tiempoRealBuilder.getDt();
  }

  public String getLat() {
    return lat;
  }

  public String getLng() {
    return lng;
  }

  public String getOzone() {
    return ozone;
  }

  public String getToken() {
    return token;
  }

  public String getAlt() {
    return alt;
  }

  public String getDt() {
    return dt;
  }
}
