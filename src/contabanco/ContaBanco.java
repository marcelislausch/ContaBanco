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
        System.out.println("Por favor, digite o n�mero da Ag�ncia:");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o n�mero da Conta:");
        conta.setNumero(Integer.valueOf(scanner.nextLine()));
        System.out.println("Por favor, digite o seu nome:");
        conta.setNome_cliente(scanner.nextLine());
        conta.setSaldo(237.48);
        
        System.out.println("Ol� " + conta.getNome_cliente() + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " j� est� dispon�vel para saque");
    }

}
