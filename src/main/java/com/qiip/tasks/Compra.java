package com.qiip.tasks;

import static com.qiip.tasks.factories.Seleccionar.elProducto;

import com.qiip.interactions.factories.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Compra implements Task {
  String categoria;
  String productos;

  public Compra(String lstProductos, String categoria) {
    this.categoria = categoria;
    this.productos = lstProductos;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String[] lstProductos = productos.trim().split("\\,");
    for (String lstProducto : lstProductos) {
      actor.attemptsTo(Seleccionar.laCategoria(categoria), elProducto(lstProducto));
    }
  }
}
