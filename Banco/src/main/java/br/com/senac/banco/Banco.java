/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

/**
 *
 * @author daniel62977606
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Daniel");
        
        conta1.depositar(18);
        
        conta1.extratoBancario();
   
        conta1.sacar(20);
     
        conta1.extratoBancario();
    }
}
