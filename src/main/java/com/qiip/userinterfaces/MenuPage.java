package com.qiip.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
  public static final Target LNK_CARRO_COMPRA =
      Target.the("el link al carro de compra").locatedBy("#cartur");
  public static final Target LNK_HOME =
      Target.the("el link al carro de compra").locatedBy("//a[contains(text(),'Home')]");

  private MenuPage() {
  }
}
