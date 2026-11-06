package aula006;

import java.util.Scanner;

public class InteracaoUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite sua altura (ex. 1,75): ");
        double altura = sc.nextDouble();

        sc.close();

        System.out.printf("\n\nOlá, %s! Você tem %d anos e sua altura é %.2fcm.\n\n", nome, idade, altura);

        System.out.println("\n\nOlá, " + nome + "! Você tem " + idade + " anos e sua altura é " + altura + "cm.\n\n");

    }

}
