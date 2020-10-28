package com.qiip.tasks;

import static com.qiip.userinterfaces.CarroCompraPage.BTN_COMPRAR;
import static com.qiip.userinterfaces.CarroCompraPage.LBL_PRODUCTOS;
import static com.qiip.userinterfaces.CarroCompraPage.LBL_TOTAL;
import static com.qiip.userinterfaces.MenuPage.LNK_CARRO_COMPRA;
import static com.qiip.userinterfaces.OrdenCompraPage.BTN_EJECUTAR_COMPRA;
import static com.qiip.userinterfaces.OrdenCompraPage.BTN_OK;

import com.qiip.models.InformacionCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CarroCompra implements Task {

  public static final String TOTAL = "total compra";
  InformacionCompra informacionCompra;

  public CarroCompra(InformacionCompra informacionCompra) {
    this.informacionCompra = informacionCompra;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(JavaScriptClick.on(LNK_CARRO_COMPRA));
    actor.attemptsTo(Ensure.that(LBL_PRODUCTOS).isDisplayed());
    actor.remember(TOTAL, LBL_TOTAL.resolveFor(actor).getText());
    actor.attemptsTo(
        Click.on(BTN_COMPRAR),
        Diligencia.laInformacionDePago(informacionCompra),
        Check.whether(!BTN_OK.resolveFor(actor).isPresent())
            .andIfSo(Click.on(BTN_EJECUTAR_COMPRA)));
  }
}
