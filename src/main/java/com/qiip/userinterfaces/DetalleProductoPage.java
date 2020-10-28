package com.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProductoPage {

  public static final Target BTN_ADICIONAR_CARRO =
      Target.the("el boton de adicionar al carro de compra")
          .located(By.xpath("//a[contains(text(),'Add to cart')]"));

  private DetalleProductoPage() {
  }
}
