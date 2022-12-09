package com.otaviolube.bolao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aposta")
public class ApostaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private RodadaModel[] rodadas;

  public ApostaModel() {
  }

  public ApostaModel(Long id, RodadaModel[] rodadas) {
    this.id = id;
    this.rodadas = rodadas;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RodadaModel[] getRodadas() {
    return rodadas;
  }

  public void setRodadas(RodadaModel[] rodadas) {
    this.rodadas = rodadas;
  }

}
