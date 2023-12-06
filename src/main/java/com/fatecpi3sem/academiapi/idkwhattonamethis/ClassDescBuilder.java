package com.fatecpi3sem.academiapi.idkwhattonamethis;

public abstract class ClassDescBuilder{

  private String Nome;

  private String Descricao;

  public ClassDescBuilder(String nome2, String desc) {
	// TODO Auto-generated constructor stub
	  nome2 = Nome;
	  desc = Descricao;
}

public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    nome = Nome;
  }

  public String getDesc() {
    return Descricao;
  }

  public void setDesc(String desc) {
    desc = Descricao;
  }

}