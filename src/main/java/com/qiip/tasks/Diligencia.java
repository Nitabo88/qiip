package com.qiip.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.qiip.models.InformacionCompra;
import net.serenitybdd.screenplay.Performable;

public class Diligencia {

  private Diligencia() {
  }

  public static Performable elPago(InformacionCompra informacionCompra) {
    return instrumented(CarroCompra.class, informacionCompra);
  }

  public static Performable laInformacionDePago(InformacionCompra informacionCompra) {
    return instrumented(InformacionPago.class, informacionCompra);
  }
}
