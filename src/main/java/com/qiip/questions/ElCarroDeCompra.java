package com.qiip.questions;

import static com.qiip.userinterfaces.CarroCompraPage.LBL_PRODUCTOS;
import static com.qiip.userinterfaces.CarroCompraPage.LST_PRODUCTOS;
import static com.qiip.userinterfaces.MenuPage.LNK_CARRO_COMPRA;
import static com.qiip.userinterfaces.MenuPage.LNK_HOME;
import static com.qiip.userinterfaces.OrdenCompraPage.BTN_OK;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Visibility;

public class ElCarroDeCompra implements Question<Boolean> {

  public static Question<Boolean> estaVacio() {
    return new ElCarroDeCompra();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.attemptsTo(
        Click.on(BTN_OK), WaitFor.seconds(1), Click.on(LNK_HOME), Click.on(LNK_CARRO_COMPRA));
    actor.attemptsTo(Ensure.that(LBL_PRODUCTOS).isDisplayed());
    return Visibility.of(LST_PRODUCTOS).viewedBy(actor).asList().isEmpty();
  }
}
