package com.qiip.tasks;

import static com.qiip.interactions.AceptarAlerta.aceptarPopUp;
import static com.qiip.userinterfaces.DetalleProductoPage.BTN_ADICIONAR_CARRO;
import static com.qiip.userinterfaces.HomePage.BTN_SIGUIENTE;
import static com.qiip.userinterfaces.HomePage.LST_PRODUCTOS;
import static com.qiip.userinterfaces.MenuPage.LNK_HOME;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Producto implements Task {
  String producto;

  public Producto(String producto) {
    this.producto = producto;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (LST_PRODUCTOS.of(producto).resolveFor(actor).isPresent()) {
      actor.attemptsTo(
          Click.on(LST_PRODUCTOS.of(producto)),
          Click.on(BTN_ADICIONAR_CARRO),
          WaitFor.seconds(1),
          aceptarPopUp(),
          Click.on(LNK_HOME));
    } else {
      while (!LST_PRODUCTOS.of(producto).resolveFor(actor).isPresent()) {
        if (BTN_SIGUIENTE.resolveFor(actor).isPresent()) {
          actor.attemptsTo(Click.on(BTN_SIGUIENTE));
          if (LST_PRODUCTOS.of(producto).resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                Click.on(LST_PRODUCTOS.of(producto)),
                Click.on(BTN_ADICIONAR_CARRO),
                WaitFor.seconds(1),
                aceptarPopUp(),
                Click.on(LNK_HOME));
          }
          break;
        }
      }
    }
  }
}
