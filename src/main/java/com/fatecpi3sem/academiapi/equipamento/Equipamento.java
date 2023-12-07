package com.fatecpi3sem.academiapi.equipamento;
import java.util.List;

public class Equipamento { //extends ClassDescBuilder{
	private String Nome;
	private String Descricao;

	
  private String Musculo;

  public String getNome() {
	    return Nome;
	  }

	  public void setNome(String nome) {
	    this.Nome = nome;
	  }

	  public String getDesc() {
	    return Descricao;
	  }

	  public void setDesc(String desc) {
	    this.Descricao = desc;
	  }

}