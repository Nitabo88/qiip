package com.qiip.tasks;

import com.qiip.models.TiempoReal;
import com.qiip.models.builders.TiempoRealBuilder;
import com.qiip.utils.UrlsApis;
import java.util.Arrays;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class RealTime implements Task {
  String request;

  public RealTime(String request) {
    this.request = request;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    List<String> lstRequest = Arrays.asList(request.trim().split("\\,"));
    TiempoReal tiempoReal =
        TiempoRealBuilder.with()
            .setToken(lstRequest.get(0))
            .setLat(lstRequest.get(1))
            .setLng(lstRequest.get(2))
            .setAlt(lstRequest.get(3))
            .setOzone(lstRequest.get(4))
            .setDt(lstRequest.get(5))
            .build();
    actor.whoCan(CallAnApi.at(UrlsApis.BASE.getUrl()));
    actor.attemptsTo(
        Get.resource(UrlsApis.REAL_TIME.getUrl())
            .with(
                requestSpecification ->
                    requestSpecification
                        .param("lat", tiempoReal.getLat())
                        .param("lng", tiempoReal.getLng())
                        .header("x-access-token", tiempoReal.getToken())));
  }
}
