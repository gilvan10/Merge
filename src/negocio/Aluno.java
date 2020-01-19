/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author renata
 */
public class Aluno {
  
  private string matricula; 
  private string nome; 
  private string cpf; 
  private string endereco; 
 

  public Aluno() {
  }   

  public Aluno(string matricula,string nome, string cpf,
                string endereco) {
     this.matricula = matricula; 
     this.nome = nome; 
     this.cpf = cpf; 
     this.endereco = endereco; 
      
  }
}
