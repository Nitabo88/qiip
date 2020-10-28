package com.qiip.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.qiip.tasks.Home;
import net.serenitybdd.screenplay.Performable;

public class Ingresa {

  private Ingresa() {
  }

  public static Performable enDemoblaze() {
    return instrumented(Home.class);
  }
}
