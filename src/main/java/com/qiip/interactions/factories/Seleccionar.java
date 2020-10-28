package com.qiip.interactions.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.qiip.interactions.Categoria;
import net.serenitybdd.screenplay.Performable;

public class Seleccionar {

  private Seleccionar() {
  }

  public static Performable laCategoria(String categoria) {
    return instrumented(Categoria.class, categoria);
  }
}
