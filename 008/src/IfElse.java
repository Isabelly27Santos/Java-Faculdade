import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) throws Exception {
        
        int valorA = 15;
        int valorB = 10;
        
        if (valorA > valorB) {
            System.out.println("O valor A é maior que o valor B");
        } else if (valorA < valorB) {
            System.out.println("O valor A é menor que o valor B");
        } else {
            System.out.println("O valor A é igual ao valor B");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu peso em Kg (Ex. 60,7): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a sua altura em metros (Ex. 1,75): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com o peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }

        scanner.close();

    }
}
