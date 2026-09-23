/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author daniel62977606
 */
public class ContaPJ extends ContaBancaria {
    private int cnpj;   
    
    public int getCpnj (){
        return this.cnpj;
    }
    
    public void setCnpj (int cnpj){
        this.cnpj = cnpj;
    }
    
    public ContaPJ (int cnpj, String titular){
        super(titular);
        this.cnpj = cnpj;
    }
    
    @Override
    public void apresentar (){
        System.out.println("Aqui suas informações " );
        System.out.println("Titular: " + getTitular());
        System.out.println("CNPJ: " + cnpj) ;
        System.out.println("Aqui seu saldo: " + getSaldo ());
    }
}
