package com.fatecpi3sem.academiapi.personal;

import java.util.List;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Certificacoes;
import com.fatecpi3sem.academiapi.academia.Academia;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Pessoa;

public class Personal extends Pessoa{

  public List<Certificacoes> Certificacaos;
  public Academia Academie;

  public void addCerts(Certificacoes cert){
    Certificacaos.add(cert);
  }
  public void removeCerts(Certificacoes cert){
    //int value = indexOf(Certificacaos.cert);
    Certificacaos.remove(cert);
  }

  public Academia getAcad(){
    return Academie;
  }
  public void setAcad(Academia acad){
    Academie = acad;
  }

  public List<Certificacoes> getCerts() {
    return Certificacaos;
  }
  public Academia getAcads() {
    return Academie;
  }

  Personal(String nome, String cpf, List<Certificacoes> certs, Academia acad){
    super(nome, cpf);
    Academie = acad;
    Certificacaos = certs;
  }
}