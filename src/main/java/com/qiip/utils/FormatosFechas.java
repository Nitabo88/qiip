package com.qiip.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatosFechas {

  private FormatosFechas() {
  }

  public static String hoy() {
    Date fecha = new Date(System.currentTimeMillis());
    DateFormat fechaFormateada = new SimpleDateFormat("dd/M/yyyy");
    return fechaFormateada.format(fecha);
  }
}
