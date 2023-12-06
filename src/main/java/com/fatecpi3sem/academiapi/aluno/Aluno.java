package com.fatecpi3sem.academiapi.aluno;

import java.util.List;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Pessoa;
import com.fatecpi3sem.academiapi.exercicio.Exercicio;

public class Aluno extends Pessoa{

  private String Plano;

  private List<Exercicio> Treino;

  public String getPlano() {
    return Plano;
  }

  public void setPlano(String plano) {
    plano = Plano;
  }

  public List<Exercicio> getTreino() {
    return Treino;
  }

  public void setTreino(List<Exercicio> treino) {
    treino = Treino;
  }

  Aluno(String nome, String cpf, String plano) {
    super(nome, cpf);
    Plano = plano;
  }
}