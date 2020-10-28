package com.qiip.stepdefinitions;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import com.qiip.questions.Codigo;
import com.qiip.questions.LaEstructura;
import com.qiip.tasks.factories.Enviar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class TiempoRealApiStepDefinition {

  @Cuando("^el (.*) envía una petición a la API Real-time (.*)$")
  public void enviarRequestRealTime(String actor, String request) {
    theActorCalled(actor).attemptsTo(Enviar.requestRealTime(request));
  }

  @Cuando("^el (.*) envía una petición a la API Hourly (.*)$")
  public void enviarRequestHourly(String request) {}

  @Cuando("^el (.*) envía una petición a la API Daily (.*)$")
  public void enviarRequestDaily(String request) {}

  @Entonces("^el usuario puede ver que la estructura (.*) y el código (.*) es el esperado$")
  public void elUsuarioPuedeVerQueLaEstructuraStructureYElCodigoCodeEsElEsperado(
      String estructura, int codigo) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                "the user can see the response code is:", Codigo.deRespuestaEs(), equalTo(codigo)),
            seeThat(
                "la estructura es igual:",
                LaEstructura.es(),
                matchesJsonSchemaInClasspath(estructura)));
  }
}
