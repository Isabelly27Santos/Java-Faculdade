package aula007;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        char opcao;
        Double valor1 = 0.0, valor2 = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalculadora\n");
        System.out.println("\nMenu de opções:\n");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");    
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão\n\n");

        opcao = sc.next().charAt(0);

        System.out.print("Escolha o valor 1: ");
        valor1 = sc.nextDouble();
        System.out.print("Escolha o valor 2: ");
        valor2 = sc.nextDouble();

        switch (opcao) {
            case '1':
                System.out.println("Você escolheu a opção de soma.");
                System.out.println("Resultado: " + (valor1 + valor2));
                break;
            case '2':
                System.out.println("Você escolheu a opção de subtração.");
                System.out.println("Resultado: " + (valor1 - valor2));
                break;
            case '3':
                System.out.println("Você escolheu a opção de multiplicação.");
                System.out.println("Resultado: " + (valor1 * valor2));
                break;
            case '4':
                System.out.println("Você escolheu a opção de divisão.");
                if (valor2 != 0) {
                    System.out.println("Resultado: " + (valor1 / valor2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }

}
