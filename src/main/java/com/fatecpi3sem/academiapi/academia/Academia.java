package com.fatecpi3sem.academiapi.academia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import java.util.List;

//import org.springframework.stereotype.Component;


//@Component
@Entity
public class Academia { //extends ClassDescBuilder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String endereco;

	  public Integer getId() {
		    return id;
		  }
	  
	  public void setId(Integer id) {
		    this.id = id;
		  }
	
	public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getEndereco() {
	    return endereco;
	  }

	  public void setEndereco(String end) {
	    this.endereco = end;
	  }

  
//  Academia(String nome, String desc, String ender, List<Personal>pers){
//    super(nome, desc);
//    Endereco = ender;
//    Personais = pers;
//  }

}