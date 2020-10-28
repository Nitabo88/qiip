package com.qiip.utils;

public enum UrlsApis {
  BASE("https://api.openuv.io/api/v1"),
  REAL_TIME("/uv"),
  HOURLY("/forecast"),
  DAILY("/protection");

  public String getUrl() {
    return url;
  }

  private final String url;

  UrlsApis(String url) {
    this.url = url;
  }
}
