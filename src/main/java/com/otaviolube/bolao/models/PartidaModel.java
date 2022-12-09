package com.otaviolube.bolao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Partida")
public class PartidaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private SelecaoModel mandante;

  @Column(nullable = false)
  private SelecaoModel visitante;

  @Column()
  private int gols_mandante;

  @Column()
  private int gols_visitante;

  public PartidaModel() {
  }

  public PartidaModel(Long id, SelecaoModel mandante, SelecaoModel visitante, int gols_mandante, int gols_visitante) {
    this.id = id;
    this.mandante = mandante;
    this.visitante = visitante;
    this.gols_mandante = gols_mandante;
    this.gols_visitante = gols_visitante;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SelecaoModel getMandante() {
    return mandante;
  }

  public void setMandante(SelecaoModel mandante) {
    this.mandante = mandante;
  }

  public SelecaoModel getVisitante() {
    return visitante;
  }

  public void setVisitante(SelecaoModel visitante) {
    this.visitante = visitante;
  }

  public int getGols_mandante() {
    return gols_mandante;
  }

  public void setGols_mandante(int gols_mandante) {
    this.gols_mandante = gols_mandante;
  }

  public int getGols_visitante() {
    return gols_visitante;
  }

  public void setGols_visitante(int gols_visitante) {
    this.gols_visitante = gols_visitante;
  }

}
