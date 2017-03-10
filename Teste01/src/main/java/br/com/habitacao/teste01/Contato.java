/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.habitacao.teste01;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author michel
 */
public class Contato { 

  private SimpleStringProperty nome; 
  private SimpleStringProperty sobrenome; 
  private SimpleStringProperty email; 

  //Construtores
  public Contato() { 
    this.nome = new SimpleStringProperty(""); 
    this.sobrenome = new SimpleStringProperty(""); 
    this.email = new SimpleStringProperty(""); 
  } 
  
  public Contato(String nome, String sobrenome, String email) { 
    this.nome = new SimpleStringProperty(nome); 
    this.sobrenome = new SimpleStringProperty(sobrenome); 
    this.email = new SimpleStringProperty(email); 
  } 
 
  // Getters and setters
  public String getNome() { return nome.get(); } 
  public void setNome(String nome) { this.nome.set(nome); } 
 
  public String getSobrenome() { return sobrenome.get(); } 
  public void setSobrenome(String sobrenome) { this.sobrenome.set(sobrenome); } 
 
  public String getEmail() { return email.get(); } 
  public void setEmail(String email) { this.email.set(email); } 

}