import java.util.Arrays;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de linhas da matriz A: ");
        int linA = sc.nextInt();
        sc.nextLine();
        System.out.print("Número de colunas da matriz A: ");
        int colA = sc.nextInt();
        sc.nextLine();


        System.out.print("Número de linhas da matriz B: ");
        int linB = sc.nextInt();
        sc.nextLine();
        System.out.print("Número de colunas da matriz B: ");
        int colB = sc.nextInt();
        sc.nextLine();  

        if(colA != linB) {
            System.out.println("Não foi possível multiplicar as matrizes.");
            sc.close();
            System.exit(0);
        }

        double[][] matrizA = new double [linA][colA];
        double[][] matrizB = new double [linB][colB];
        double[][] matrizC = new double [linA][colB];   

        
        System.out.print("Digite os valores da matriz A: ");
        for (int i=0; i<linA; i++) {
            for (int j=0; j<colA; j++) {
                System.out.printf("\nLinha %d x Coluna %d: ", i, j);
                matrizA[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Digite os valores da matriz B: ");
        for (int i=0; i<linB; i++) {
            for (int j=0; j<colB; j++) {
                System.out.printf("\nLinha %d x Coluna %d: ", i, j);
                matrizB[i][j] = sc.nextDouble();
            }
        }

        for (int i=0; i<linA; i++) {
            for (int j=0; j<colB; j++) {
                for (int k=0; k<colA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        for (double[] ds : matrizC) {
            System.out.println(Arrays.toString(ds));
        }

        sc.close();

    }

}
