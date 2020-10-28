package com.qiip.stepdefinitions;

import static com.qiip.models.builders.InformacionCompraBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.qiip.questions.DetalleCompra;
import com.qiip.questions.ElCarroDeCompra;
import com.qiip.questions.factories.Mensaje;
import com.qiip.tasks.Diligencia;
import com.qiip.tasks.factories.Ingresa;
import com.qiip.tasks.factories.Seleccionar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class CompraProductoStepDefinition {

  private static final String MENSAJE = "Thank you for your purchase!";

  @Dado("^que (.*) esta en la pagina de demoblaze$")
  public void ingresarHomePage(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.enDemoblaze());
  }

  @Cuando("^el cliente agrega los productos (.*) de las categorías (.*) al carro de compra$")
  public void agregarProductos(String lstProductos, String categoria) {
    theActorInTheSpotlight().attemptsTo(Seleccionar.losProductosAComprar(lstProductos, categoria));
  }

  @Y("hace el proceso de pago del producto")
  public void pagarProducto() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elPago(con().usuarioDeCompra()));
  }

  @Entonces("el cliente puede ver que su compra fue efectuada")
  public void verificarCompra() {
    theActorInTheSpotlight()
        .should(
            seeThat("el mensaje de compra es", Mensaje.es(), equalTo(MENSAJE)),
            seeThat(
                "el valor:",
                DetalleCompra.es(1),
                containsString(
                    theActorInTheSpotlight()
                        .asksFor(Mensaje.detalleDeCompra(con().usuarioDeCompra(), 0)))),
            seeThat(
                "el numero de tarjeta:",
                DetalleCompra.es(2),
                containsString(
                    theActorInTheSpotlight()
                        .asksFor(Mensaje.detalleDeCompra(con().usuarioDeCompra(), 1)))),
            seeThat(
                "el nombre:",
                DetalleCompra.es(3),
                containsString(
                    theActorInTheSpotlight()
                        .asksFor(Mensaje.detalleDeCompra(con().usuarioDeCompra(), 2)))),
            seeThat(
                "la fecha:",
                DetalleCompra.es(4),
                containsString(
                    theActorInTheSpotlight()
                        .asksFor(Mensaje.detalleDeCompra(con().usuarioDeCompra(), 3)))),
            seeThat("el carro de compra quedo sin productos.", ElCarroDeCompra.estaVacio()));
  }
}
