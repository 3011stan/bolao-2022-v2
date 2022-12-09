package com.otaviolube.bolao.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rodada")
public class RodadaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private PartidaModel[] partidas;

  @Column(nullable = false)
  private Date data_limite;

  public RodadaModel() {
  }

  public RodadaModel(Long id, PartidaModel[] partidas, Date data_limite) {
    this.id = id;
    this.partidas = partidas;
    this.data_limite = data_limite;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PartidaModel[] getPartidas() {
    return partidas;
  }

  public void setPartidas(PartidaModel[] partidas) {
    this.partidas = partidas;
  }

  public Date getData_limite() {
    return data_limite;
  }

  public void setData_limite(Date data_limite) {
    this.data_limite = data_limite;
  }

}
