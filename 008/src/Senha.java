import java.util.Scanner;

public class Senha {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (senha.equals("1234")) {
                System.out.println("Acesso permitido.");
                break;  // Sai do loop se a senha estiver correta
            } else {
                System.out.println("Acesso negado. Tente novamente.");
            }

            sc.nextLine();  // Aguarda o usuário pressionar ENTER antes de limpar a tela
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        sc.close();
    }

}
