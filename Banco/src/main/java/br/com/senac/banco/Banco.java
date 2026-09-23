/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

import java.util.Scanner;

/**
 *
 * @author daniel62977606
 */
public class Banco {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;
        String cpf;
        
        System.out.println("Nome do titular: ");
        nome = entrada.next();
        
        System.out.println("CPF do titular: ");
        cpf = entrada.nextLine();
        
        ContaPF conta1 = new ContaPF(445645745, "Lucas");
        ContaPJ conta2 = new ContaPJ(545476765, "Daniel");
         conta1.depositar(50);
         conta2.depositar(60);
        
        conta1.apresentar();
        
       System.out.println();
       
       conta2.apresentar();
    }
}
