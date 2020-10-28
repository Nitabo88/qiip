package com.qiip.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaEstructura implements Question<String> {

  public static LaEstructura es() {
    return new LaEstructura();
  }

  @Override
  public String answeredBy(Actor actor) {
    return SerenityRest.lastResponse().body().asString();
  }
}
