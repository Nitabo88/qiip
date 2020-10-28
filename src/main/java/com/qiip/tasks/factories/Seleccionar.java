package com.qiip.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.qiip.tasks.Compra;
import com.qiip.tasks.Producto;
import net.serenitybdd.screenplay.Performable;

public class Seleccionar {

  private Seleccionar() {}

  public static Performable elProducto(String productos) {
    return instrumented(Producto.class, productos);
  }

  public static Performable losProductosAComprar(String lstProductos, String categoria) {
    return instrumented(Compra.class, lstProductos, categoria);
  }
}
