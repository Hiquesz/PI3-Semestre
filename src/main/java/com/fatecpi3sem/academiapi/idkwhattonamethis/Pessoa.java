package com.fatecpi3sem.academiapi.idkwhattonamethis;

public abstract class Pessoa{

  private String Nome;

  private String CPF;

  public Pessoa(String nome2, String cpf2) {
	// TODO Auto-generated constructor stub
}

public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    Nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cpf) {
    CPF = cpf;
  }

}