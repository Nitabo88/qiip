package com.qiip.models.builders;

import com.qiip.models.TiempoReal;
import com.qiip.utils.Builder;

public class TiempoRealBuilder implements Builder<TiempoReal> {
  String token;
  String lat;
  String lng;
  String alt;
  String ozone;
  String dt;

  public static TiempoRealBuilder with() {
    return new TiempoRealBuilder();
  }

  @Override
  public TiempoReal build() {
    return new TiempoReal(this);
  }

  public String getLat() {
    return lat;
  }

  public TiempoRealBuilder setLat(String lat) {
    this.lat = lat;
    return this;
  }

  public String getLng() {
    return lng;
  }

  public TiempoRealBuilder setLng(String lng) {
    this.lng = lng;
    return this;
  }

  public String getOzone() {
    return ozone;
  }

  public TiempoRealBuilder setOzone(String ozone) {
    this.ozone = ozone;
    return this;
  }

  public String getToken() {
    return token;
  }

  public TiempoRealBuilder setToken(String token) {
    this.token = token;
    return this;
  }

  public String getDt() {
    return dt;
  }

  public TiempoRealBuilder setDt(String dt) {
    this.dt = dt;
    return this;
  }

  public String getAlt() {
    return alt;
  }

  public TiempoRealBuilder setAlt(String alt) {
    this.alt = alt;
    return this;
  }
}
