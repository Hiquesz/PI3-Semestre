package com.fatecpi3sem.academiapi.personal;

import java.util.List;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Certificacoes;
import com.fatecpi3sem.academiapi.academia.Academia;
import com.fatecpi3sem.academiapi.idkwhattonamethis.Pessoa;

public class Personal extends Pessoa{

  public List<Certificacoes> certificacaos;
  public Academia academie;

  public void addCerts(Certificacoes cert){
    certificacaos.add(cert);
  }
  public void removeCerts(Certificacoes cert){
    //int value = indexOf(Certificacaos.cert);
    certificacaos.remove(cert);
  }

  public Academia getAcad(){
    return academie;
  }
  public void setAcad(Academia acad){
    academie = acad;
  }

  public List<Certificacoes> getCerts() {
    return certificacaos;
  }
  public Academia getAcads() {
    return academie;
  }

  //Personal(String nome, String cpf, List<Certificacoes> certs, Academia acad){
  //  super(nome, cpf);
  //  Academie = acad;
  //  Certificacaos = certs;
  //}
}