package com.qiip.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.qiip.tasks.RealTime;
import net.serenitybdd.screenplay.Performable;

public class Enviar {

  private Enviar() {}

  public static Performable requestRealTime(String request) {
    return instrumented(RealTime.class, request);
  }
}
