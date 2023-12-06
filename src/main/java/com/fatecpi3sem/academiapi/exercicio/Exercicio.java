package com.fatecpi3sem.academiapi.exercicio;

import java.util.List;
import com.fatecpi3sem.academiapi.equipamento.Equipamento;
import com.fatecpi3sem.academiapi.idkwhattonamethis.ClassDescBuilder;

public class Exercicio extends ClassDescBuilder{

  private Equipamento EquipamentoUtilizado;

  Exercicio(String nome, String desc, Equipamento equip) {
    super(nome, desc);
    EquipamentoUtilizado = equip;
  }

}