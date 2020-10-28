package com.qiip.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject {
  public static final Target LBL_CATEGORIA =
      Target.the("la fila de la categoría").locatedBy("//a[text()='{0}']");
  public static final Target LST_PRODUCTOS =
      Target.the("el titulo del producto").locatedBy("//a[text()='{0}']");
  public static final Target BTN_SIGUIENTE =
      Target.the("el titulo del producto").locatedBy("#next2");
  public static final Target LBL_LOGO =
      Target.the("el titulo de la pagina").locatedBy("#nava");
}
