package com.fatecpi3sem.academiapi.aluno;

import java.util.List;

import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Pessoa;
//import com.fatecpi3sem.academiapi.exercicio.Exercicio;

@Component
@Entity
public class Aluno extends Pessoa{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	private Integer id;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }
	  
  private String plano;
  private String treino;

  public String getPlano() {
    return plano;
  }

  public void setPlano(String plano) {
    this.plano = plano;
  }

  public String getTreino() {
    return treino;
  }

  public void setTreino(String treino) {
    this.treino = treino;
  }

  //Aluno(String nome, String cpf, String plano) {
  //  super(nome, cpf);
  //  Plano = plano;
  //}
}