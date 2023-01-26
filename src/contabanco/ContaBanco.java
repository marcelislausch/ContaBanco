/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author programador2
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta:");
        conta.setNumero(Integer.valueOf(scanner.nextLine()));
        System.out.println("Por favor, digite o seu nome:");
        conta.setNome_cliente(scanner.nextLine());
        conta.setSaldo(237.48);
        
        System.out.println("Olá " + conta.getNome_cliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");
    }

}
