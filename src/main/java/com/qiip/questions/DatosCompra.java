package com.qiip.questions;

import static com.qiip.tasks.CarroCompra.TOTAL;
import static com.qiip.utils.FormatosFechas.hoy;

import com.qiip.models.InformacionCompra;
import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DatosCompra implements Question<String> {
  InformacionCompra informacionCompra;
  int i;

  public DatosCompra(InformacionCompra informacionCompra, int i) {
    this.informacionCompra = informacionCompra;
    this.i = i;
  }

  @Override
  public String answeredBy(Actor actor) {
    List<String> lstDatosCompra = new ArrayList<>();
    lstDatosCompra.add(actor.recall(TOTAL));
    lstDatosCompra.add(informacionCompra.getTarjetaCredito());
    lstDatosCompra.add(informacionCompra.getNombre());
    lstDatosCompra.add(hoy());
    return lstDatosCompra.get(i);
  }
}
