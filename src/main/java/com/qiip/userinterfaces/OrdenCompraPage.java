package com.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrdenCompraPage {
  public static final Target BTN_EJECUTAR_COMPRA =
      Target.the("el boton de comprar").located(By.xpath("//button[(text()='Purchase')]"));
  public static final Target TXT_NOMBRE = Target.the("nombre").locatedBy("#name");
  public static final Target TXT_PAIS = Target.the("pais").locatedBy("#country");
  public static final Target TXT_CIUDAD = Target.the("ciudad").locatedBy("#city");
  public static final Target TXT_TARJETA_CREDITO =
      Target.the("tarjeta de credito").locatedBy("#card");
  public static final Target TXT_MES_TARJETA =
      Target.the("el mes de vencimiento de la tarjeta de credito").locatedBy("#month");
  public static final Target TXT_ANIO_TARJETA =
      Target.the("el año de vencimiento de la tarjeta de credito").locatedBy("#year");
  public static final Target LBL_COMPRA_EXITOSA =
      Target.the("el mensaje de compra exitosa").locatedBy("//h2[contains(text(),'Thank you')]");
  public static final Target LBL_DETALLES_COMPRA =
      Target.the("el detalle de la compra").locatedBy("//p[@class='lead text-muted ']");
  public static final Target BTN_OK =
      Target.the("el boton OK").locatedBy("//button[contains(text(),'OK')]");

  private OrdenCompraPage() {
  }
}
