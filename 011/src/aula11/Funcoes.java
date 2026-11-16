package aula11;

public class Funcoes {

    public static void main(String[] args) {

        olaMundo();

        int A = 35;
        int B = 15;

        System.out.println("Resultado: " + somaValores(A, B));

        double x = 5.45;
        double y = 3.24;

        System.out.printf("Resultado:  %.2f %n", somaValores(x, y));

        System.out.printf("Resultado: %.2f %n", (somaValores(x, y)+somaValores(A, B)));

        double [] valores = {3.4, 33.5, 22.6, 3, 6, 12.3};

        System.out.printf("Resultado da Média:  %.2f %n", mediaVetor(valores));

        System.out.println("Concatenar: "+ concatenarString("Olá, ", "Mundo! ", "Ainda ", "estou ", "aqui ", ":)"));
        
    }

    static void olaMundo() {
        System.out.println("Olá, Mundo!");
    }

    static int somaValores(int a, int b) {
        
        return a + b;

    }

    static double somaValores(double a, double b) {
        
        return a + b;

    }

    static double mediaVetor(double[] vetor) {

        double soma = 0;

        for (double valor : vetor) {
            soma += valor;
        }

        return soma;

    }

    static String concatenarString(String...args) {

        String concatenada ="";

        for (String str : args) {
            concatenada = concatenada + str;
        }
        return concatenada;
    }

}
