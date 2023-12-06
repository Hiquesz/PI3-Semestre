package com.fatecpi3sem.academiapi.idkwhattonamethis;

public class Certificacoes extends ClassDescBuilder {
  private int DataAquis;

  Certificacoes(String nome, String desc, int data){
    super(nome, desc);
    DataAquis = data;
  }
}