/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author daniel62977606
 */
public class ContaPF extends ContaBancaria{
    private int cpf;
    
    public int getCpf (){
      return this.cpf;
}
    
    public void setCpf (int cpf){
        this.cpf = cpf;
    }
    
    public ContaPF (int cpf, String titular){
        super(titular);
        this.cpf = cpf;
    }
    
    @Override
    public void apresentar (){
        System.out.println("Aqui suas informações " );
        System.out.println("Titular: " + getTitular());
        System.out.println("CPF: " + cpf);
        System.out.println("Aqui seu saldo: " + getSaldo ());
    
    }
}
