import java.util.Scanner;   

public class LacoFor {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para a soma sucessiva: ");
        int valor = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= valor; i++) {
            soma += i;
        }

        System.out.println("A soma sucessiva de 1 até " + valor + " é: " + soma);

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            if (i==5) {
                continue;  // Pula a iteração quando i é igual a 5
            }
            if (i==8) {  // Sai do loop quando i é igual a 8
                break;
            }
            System.out.println("O valor de i é: " + i);
        }
    }

}
