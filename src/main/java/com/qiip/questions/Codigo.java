package com.qiip.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Codigo implements Question<Integer> {

  public static Codigo deRespuestaEs() {
    return new Codigo();
  }

  @Override
  public Integer answeredBy(Actor actor) {
    return SerenityRest.lastResponse().statusCode();
  }
}
