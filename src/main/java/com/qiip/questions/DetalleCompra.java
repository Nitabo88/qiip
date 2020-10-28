package com.qiip.questions;

import static com.qiip.userinterfaces.OrdenCompraPage.LBL_DETALLES_COMPRA;

import java.util.Arrays;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DetalleCompra implements Question<String> {

  int i;

  public DetalleCompra(int i) {
    this.i = i;
  }

  public static Question<String> es(int i) {
    return new DetalleCompra(i);
  }

  @Override
  public String answeredBy(Actor actor) {
    List<String> lstDetalles =
        Arrays.asList(LBL_DETALLES_COMPRA.resolveFor(actor).getText().split("\n"));
    return lstDetalles.get(i);
  }
}
