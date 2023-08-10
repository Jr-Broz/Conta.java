package com.mycompany.conta;
public class Conta {

    public static void main(String[] args) {
        
        
        Sacar cliente1 = new Sacar();
        
        cliente1.setDono("Joao");
        cliente1.setLimite(0);
        cliente1.setNumero(12345);
        cliente1.setSaldo(1000);
       
        
        cliente1.printSacar();
        
        
    }
}
