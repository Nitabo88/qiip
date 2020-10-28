package com.qiip.tasks;

import static com.qiip.userinterfaces.HomePage.LBL_LOGO;

import co.com.devco.automation.mobile.actions.WaitFor;
import com.qiip.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Home implements Task {

  private static final String PRODUCT_STORE = "PRODUCT STORE";
  HomePage homePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(homePage), WaitFor.seconds(2));
    actor.attemptsTo(Ensure.that(LBL_LOGO.resolveFor(actor).getText()).contains(PRODUCT_STORE));
  }
}
