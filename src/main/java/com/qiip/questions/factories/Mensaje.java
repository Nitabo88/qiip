package com.qiip.questions.factories;

import static com.qiip.userinterfaces.OrdenCompraPage.LBL_COMPRA_EXITOSA;

import com.qiip.models.InformacionCompra;
import com.qiip.questions.DatosCompra;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Mensaje {

  private Mensaje() {
  }

  public static Question<String> es() {
    return actor -> Text.of(LBL_COMPRA_EXITOSA).viewedBy(actor).value();
  }

  public static Question<String> detalleDeCompra(InformacionCompra usuarioDeCompra, int i) {
    return new DatosCompra(usuarioDeCompra, i);
  }
}
