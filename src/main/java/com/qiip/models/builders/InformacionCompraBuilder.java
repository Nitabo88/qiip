package com.qiip.models.builders;

import com.qiip.models.InformacionCompra;
import com.qiip.utils.Builder;

public class InformacionCompraBuilder implements Builder<InformacionCompra> {
  String nombre;
  String pais;
  String ciudad;
  String tarjetaCredito;
  String mesTarjeta;
  String anioTarjeta;

  public InformacionCompraBuilder() {
    this.nombre = "";
    this.pais = "";
    this.ciudad = "";
    this.tarjetaCredito = "";
    this.mesTarjeta = "";
    this.anioTarjeta = "";
  }

  public static InformacionCompraBuilder con() {
    return new InformacionCompraBuilder();
  }

  @Override
  public InformacionCompra build() {
    return new InformacionCompra(this);
  }

  public String getNombre() {
    return nombre;
  }

  public InformacionCompraBuilder nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public String getPais() {
    return pais;
  }

  public InformacionCompraBuilder yPais(String pais) {
    this.pais = pais;
    return this;
  }

  public String getCiudad() {
    return ciudad;
  }

  public InformacionCompraBuilder yCiudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  public String getTarjetaCredito() {
    return tarjetaCredito;
  }

  public InformacionCompraBuilder yTarjetaCredito(String tarjetaCredito) {
    this.tarjetaCredito = tarjetaCredito;
    return this;
  }

  public String getMesTarjeta() {
    return mesTarjeta;
  }

  public InformacionCompraBuilder yMesTarjeta(String mesTarjeta) {
    this.mesTarjeta = mesTarjeta;
    return this;
  }

  public String getAnioTarjeta() {
    return anioTarjeta;
  }

  public InformacionCompraBuilder yAnioTarjeta(String anioTarjeta) {
    this.anioTarjeta = anioTarjeta;
    return this;
  }

  public InformacionCompra usuarioDeCompra() {
    nombre("Prueba qiip");
    yPais("Colombia");
    yCiudad("Medellin");
    yTarjetaCredito("4200000000");
    yMesTarjeta("06");
    yAnioTarjeta("2020");
    return build();
  }
}
