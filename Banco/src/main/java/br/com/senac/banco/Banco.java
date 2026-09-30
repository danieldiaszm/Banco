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
        
        ContaPF conta3 = new ContaPF(445645745, "Lucas");
        ContaPJ conta2 = new ContaPJ(545476765, "Daniel");
        
       ContaBancaria conta1 = new ContaBancaria("Daniel");
       
       int opcao = 1;
       
       while(opcao !=5){
       System.out.println("============ CONTA BANCARIA ============");
       System.out.println("1 - Depositar");
       System.out.println("2 - Sacar");
       System.out.println("3 - Consultar saldo");
       System.out.println("4 - Verificar situação da conta");
       System.out.println("5 - Sair");
       
       opcao = entrada.nextInt();
       
       switch(opcao){
        case 1:
            System.out.println("Digite o valor a ser depositado: ");
            double valorDeposito = entrada.nextDouble();
            conta1.depositar(valorDeposito);
        break;
        
        case 2:
            System.out.println("Digite o valor a ser sacado: ");
            double valorSaque = entrada.nextDouble();
            conta1.sacar(valorSaque);
        break;
        
        case 3:
            conta1.extratoBancario();
        break;
        
        case 4:
            conta1.verificarSaldo();
        break;
        
        case 5:
            System.out.println("Saindo...");
        break;    
             
    }
}
}
}    
