package com.fatecpi3sem.academiapi.idkwhattonamethis;

public abstract class Pessoa{

  private String nome;

  private String cpf;

  //public Pessoa(String nome2, String cpf2) {
	// TODO Auto-generated constructor stub
  //}

public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
	  this.cpf = cpf;
  }

}