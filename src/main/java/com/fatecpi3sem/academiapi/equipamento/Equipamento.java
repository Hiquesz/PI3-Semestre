package com.fatecpi3sem.academiapi.equipamento;
import java.util.List;
import com.fatecpi3sem.academiapi.idkwhattonamethis.ClassDescBuilder;

public class Equipamento extends ClassDescBuilder{

  private String Musculo;

  Equipamento(String nome, String desc, String musc) {
    super(nome, desc);
    Musculo = musc;
  }
}