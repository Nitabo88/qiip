package com.qiip.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AceptarAlerta implements Interaction {

  public static Performable aceptarPopUp() {
    return instrumented(AceptarAlerta.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
  }
}
