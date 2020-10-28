package com.qiip.tasks;

import static com.qiip.userinterfaces.OrdenCompraPage.BTN_EJECUTAR_COMPRA;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_ANIO_TARJETA;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_CIUDAD;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_MES_TARJETA;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_NOMBRE;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_PAIS;
import static com.qiip.userinterfaces.OrdenCompraPage.TXT_TARJETA_CREDITO;

import com.qiip.models.InformacionCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InformacionPago implements Task {
  InformacionCompra informacionCompra;

  public InformacionPago(InformacionCompra informacionCompra) {
    this.informacionCompra = informacionCompra;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(informacionCompra.getNombre()).into(TXT_NOMBRE),
        Enter.theValue(informacionCompra.getPais()).into(TXT_PAIS),
        Enter.theValue(informacionCompra.getCiudad()).into(TXT_CIUDAD),
        Enter.theValue(informacionCompra.getTarjetaCredito()).into(TXT_TARJETA_CREDITO),
        Enter.theValue(informacionCompra.getMesTarjeta()).into(TXT_MES_TARJETA),
        Enter.theValue(informacionCompra.getAnioTarjeta()).into(TXT_ANIO_TARJETA),
        Click.on(BTN_EJECUTAR_COMPRA));
  }
}
