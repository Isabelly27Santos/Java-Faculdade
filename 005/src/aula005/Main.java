package aula005;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 20;
        int b = 10;
        int c = a / b;

        System.out.println("Resultado da divisão: " + c);

        final float PI = 3.14f;
        double raio = 5.0;
        double area = PI * raio * raio;
        System.out.println("Valor de pi: " + PI);
        System.out.println("Área do círculo: " + area);

        String textoSaldo = "Seu saldo é: ";
        String dolares = " dólares";
        String textoFinal = textoSaldo + c + dolares;
        System.out.println(textoFinal);

        float fValor = 478.4574f;
        double dValor = 9858.1254;
        fValor = (float) dValor;

        System.out.println("Valor float: " + fValor);

        String s = "Bem vindo x";
        s= s.replace("x", "ao curso de Java");
        s = s.toUpperCase(); 
        s = s.concat ("!!!");
        System.out.println(s);

    }
}
