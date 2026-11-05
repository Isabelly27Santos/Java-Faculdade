package escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaCliente {

    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcao;
        do {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\nMenu:\n");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por nome");
            System.out.println("0. Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    pausar();
                    break;
                case 2:
                    listarClientes();
                    pausar();
                    break;
                case 3:
                    buscarClientePorNome();
                    pausar();
                    break;
                case 0:
                    pausar();
                    System.out.println("Saindo...");
                    break;
                default:
                    pausar();
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCliente() {
        System.out.println("\nCadastro de Cliente:\n");
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = sc.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarClientes() {
        System.out.println("\nLista de Clientes:\n");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente a : clientes) {
                System.out.println(a);
            }
        }
    }

    private static void buscarClientePorNome() {
        System.out.println("\nBuscar Cliente por Nome:\n");
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        boolean encontrado = false;

        for (Cliente a : clientes) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                System.out.println(a);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private static void pausar() {
    System.out.println("\nPressione ENTER para continuar...");
    sc.nextLine();
    }
}




