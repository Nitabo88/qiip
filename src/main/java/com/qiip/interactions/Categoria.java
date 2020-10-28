package com.qiip.interactions;

import static com.qiip.userinterfaces.HomePage.LBL_CATEGORIA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class Categoria implements Interaction {

  private static final String ALL = "All";
  String categoria;

  public Categoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (!categoria.equals(ALL)) {
      actor.attemptsTo(Click.on(LBL_CATEGORIA.of(categoria)));
    }
  }
}
