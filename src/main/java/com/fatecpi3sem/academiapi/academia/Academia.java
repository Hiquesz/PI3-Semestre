package com.fatecpi3sem.academiapi.academia;

import java.util.List;
import com.fatecpi3sem.academiapi.idkwhattonamethis.ClassDescBuilder;
import com.fatecpi3sem.academiapi.personal.Personal;

public class Academia { //extends ClassDescBuilder {
	
  private String Nome;
  private List<Personal> Personais;
  private String Endereco;

  public List<Personal> getPersonais() {
    return Personais;
  }

  public void addPersonais(Personal personal) {
    Personais.add(personal);
  }
  public void removePersonais(Personal personal){
    //int value = indexOf(Personais.personal);
	  Personais.remove(personal);
  }

  public String getEndereco() {
    return Endereco;
  }

  public void setEndereco(String endereco) {
    this.Endereco = endereco;
  }
  
  public String getNome() {
	  return Nome;
  }
  
  public void setNome(String nome) {
	  this.Nome = nome;
  }

//  Academia(String nome, String desc, String ender, List<Personal>pers){
//    super(nome, desc);
//    Endereco = ender;
//    Personais = pers;
//  }

}