package com.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarroCompraPage {

  public static final Target BTN_COMPRAR =
      Target.the("el boton comprar").located(By.xpath("//button[@class='btn btn-success']"));
  public static final Target LST_PRODUCTOS =
      Target.the("la fila de productos del carro").located(By.xpath("//tbody[@id='tbodyid']//tr"));
  public static final Target LBL_PRODUCTOS =
      Target.the("el titulo del carro de compra")
          .located(By.xpath("//h2[contains(text(),'Products')]"));
  public static final Target LBL_TOTAL =
      Target.the("el total del carro de compra").locatedBy("#totalp");

  private CarroCompraPage() {
  }
}
