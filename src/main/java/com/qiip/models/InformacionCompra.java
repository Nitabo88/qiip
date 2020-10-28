package com.qiip.models;

import com.qiip.models.builders.InformacionCompraBuilder;

public class InformacionCompra {

  String nombre;
  String pais;
  String ciudad;
  String tarjetaCredito;
  String mesTarjeta;
  String anioTarjeta;

  public InformacionCompra(InformacionCompraBuilder informacionCompraBuilder) {
    this.nombre = informacionCompraBuilder.getNombre();
    this.pais = informacionCompraBuilder.getPais();
    this.ciudad = informacionCompraBuilder.getCiudad();
    this.tarjetaCredito = informacionCompraBuilder.getTarjetaCredito();
    this.mesTarjeta = informacionCompraBuilder.getMesTarjeta();
    this.anioTarjeta = informacionCompraBuilder.getAnioTarjeta();
  }

  public String getNombre() {
    return nombre;
  }

  public String getPais() {
    return pais;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getTarjetaCredito() {
    return tarjetaCredito;
  }

  public String getMesTarjeta() {
    return mesTarjeta;
  }

  public String getAnioTarjeta() {
    return anioTarjeta;
  }
}
