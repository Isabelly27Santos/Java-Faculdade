package aula007;

import java.util.Scanner;

public class Calculadora {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opcao = -1;
        Double valor1 = 0.0, valor2 = 0.0;
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\nCalculadora\n");
            System.out.println("\nMenu de opções:\n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");    
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão\n");
            System.out.print("0 - Sair\n\n");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção de soma.");
                    System.out.print("Escolha o valor 1: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Escolha o valor 2: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Resultado: " + (valor1 + valor2));
                    pausar();
                    break;
                case 2:
                    System.out.print("Escolha o valor 1: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Escolha o valor 2: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Você escolheu a opção de subtração.");
                    System.out.println("Resultado: " + (valor1 - valor2));
                    pausar();
                    break;
                case 3:
                    System.out.print("Escolha o valor 1: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Escolha o valor 2: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Você escolheu a opção de multiplicação.");
                    System.out.println("Resultado: " + (valor1 * valor2));
                    pausar();
                    break;
                case 4:
                    System.out.print("Escolha o valor 1: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Escolha o valor 2: ");
                    valor2 = sc.nextDouble();
                    System.out.println("Você escolheu a opção de divisão.");
                    if (valor2 != 0) {
                        System.out.println("Resultado: " + (valor1 / valor2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    pausar();
                    break;
                case 0:
                    System.out.println("Saindo da calculadora. Até logo!");
                    pausar();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    pausar();
                    break;
            }

        }

        sc.close();

        
    }

    private static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
    

}
