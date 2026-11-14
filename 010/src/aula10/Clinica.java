package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

    static Scanner scanner = new Scanner(System.in);
    static List<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {

        int op = 0;

        do {

            op = menu();

            switch (op) {
                case 1:
                    System.out.println("Cadastrar");
                    cadastrar();
                    break;

                case 2:
                    System.out.println("Listar");
                    listar();
                    break;

                case 3:
                    System.out.println("Pesquisar");
                    pesquisar();
                    break;
                
                case 0:
                    System.out.println("Sair");
                    break;
            
                default: 
                System.out.println("Inválido");;
            }

        }while (op != 0);

    }

    public static int menu() {

        System.out.println("-------------Sistema de Pacientes-------------");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Listar pacientes");
        System.out.println("3 - Pesquisar paciente");
        System.out.println("0 - Sair");
        System.out.print("Digite uma opção: ");
        int op = scanner.nextInt();
        scanner.nextLine();
        return op;
    }

    public static void cadastrar() {

        Paciente p = new Paciente();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        p.setNome(nome);
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        p.setIdade(idade);
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        p.setCpf(cpf);
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        p.setTelefone(telefone);

        pacientes.add(p);

        System.out.println("Paciente Cadastrado com sucesso!");
    }

    public static void listar() {
        System.out.println("---------------Lista de Pacientes---------------");

        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

    public static void pesquisar() {

        System.out.println("---------------Pesquisar Pacientes---------------");
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println(buscar(cpf));
        

    }

    public static Paciente buscar (String cpf) {

        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }
        
}


