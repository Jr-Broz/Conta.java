package com.mycompany.conta;

public class Sacar {

    private int numero;
    private String Dono;
    private double saldo;
    private double limite;

void setNumero(int numero){
    
    this.numero = numero;
}
  
int  getNumero(){
        
    return this.numero;
}
  //=====================================  
  
void setDono(String Dono){
       
       this.Dono = Dono;
   }
    
String getDono(){
       
       return this.Dono;
       
   }
//======================================   
    
void setSaldo(double saldo){
       
       
     this.saldo = saldo;
       
   }
   
double getSaldo(){
       
       return this.saldo;
   }
//============================  
   
void setLimite(double limite){
       
       this.limite = limite;
   }
   
double getLimite(){
       
     return this.limite;
   }
//=====================================================
   
   
  void depositar(double valor){
      
     saldo = saldo + valor;
  } 
  boolean sacar(double valor){
      
      if(valor > saldo){
          
          return false;
    
      }
      else{
          saldo = saldo - valor;
          return true;
      }
      
  }

  void printSacar() {
  
      System.out.println(Dono);
      System.out.println(numero);
      System.out.println(saldo);
      
  }  
}
