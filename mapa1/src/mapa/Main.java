// O código possui uma classe chamada Produto, responsável por armazenar as informações de cada item, como nome, preço, quantidade em estoque e categoria. Os produtos cadastrados são armazenados em uma lista do tipo ArrayList<Produto>, permitindo adicionar e consultar diferentes itens durante a execução do programa.

//A classe Main possui um menu interativo que utiliza uma estrutura de repetição do-while para apresentar as opções ao usuário. Por meio de um switch-case, o sistema identifica a opção selecionada e chama o método correspondente para cadastrar produtos, listar os itens cadastrados, calcular o valor total em estoque ou buscar produtos por categoria.

//Os dados são recebidos por meio da biblioteca Scanner e manipulados utilizando métodos específicos para cada operação. Também foram implementadas validações de entrada e tratamento de exceções com try-catch, evitando que valores inválidos comprometam a execução do programa.

//Por fim, as informações são exibidas ao usuário por meio de System.out.println() e System.out.printf(), permitindo visualizar os produtos cadastrados, seus valores e os resultados das consultas realizadas. 



package mapa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private String categoria;

    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nPreço: R$ " + String.format("%.2f", preco)
                + "\nQuantidade em estoque: " + estoque
                + "\nCategoria: " + categoria;
    }

    public Produto() {
    }

    public Produto(String nome, double preco, int estoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        int opcao = 0;

        do {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\n---------------------------- Controle de Produtos ----------------------------");
            System.out.println("\n1 - Cadastrar produtos");
            System.out.println("2 - Listar todos os produtos");
            System.out.println("3 - Exibir estoque");
            System.out.println("4 - Buscar produtos por categoria");
            System.out.println("0 - Sair \n");

            opcao = lerInt("Digite uma opção: ");

            switch (opcao) {

                case 1:
                    cadastrarProdutos();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    exibirEstoque();
                    break;

                case 4:
                    buscarProdutos();
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema... Até mais!\n\n");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    pausar();
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }

    // Método para cadastrar produtos
    private static void cadastrarProdutos() {

        int op = lerInt("\nDigite quantos produtos deseja cadastrar: ");

        if (op >= 1) {

            for (int i = 0; i < op; i++) {

                Produto produto = new Produto();

                System.out.println("\nCadastro do produto " + (i + 1));

                System.out.print("\nNome do produto: ");
                produto.setNome(sc.nextLine().trim());

                produto.setPreco(lerDouble("Preço: "));

                produto.setEstoque(lerInt("Quantidade em estoque: "));

                System.out.print("Categoria: ");
                produto.setCategoria(sc.nextLine().trim());

                produtos.add(produto);

                System.out.println("\nProduto " + produto.getNome() + " cadastrado com sucesso!");
            }

        } else {

            System.out.println("\nQuantidade inválida!");
        }

        pausar();
    }

    // Método para listar todos os produtos
    private static void listarProdutos() {

        System.out.println("---------------------------- Lista de Produtos Cadastrados ----------------------------");

        if (produtos.isEmpty()) {

            System.out.println("\nNão há produtos cadastrados.");

        } else {

            for (Produto p : produtos) {
                System.out.println(p);
            }
        }

        pausar();
    }

    // Método para exibir o valor total em estoque
    private static void exibirEstoque() {

        System.out.println("---------------------------- Total em Estoque de Produtos ----------------------------");

        if (produtos.isEmpty()) {

            System.out.println("\nNão há produtos cadastrados.");

        } else {

            double total = 0;

            for (Produto p : produtos) {

                double valorTotal = p.getPreco() * p.getEstoque();

                System.out.println(
                        "\nNome: " + p.getNome()
                        + "\nPreço x Quantidade: R$ "
                        + String.format("%.2f", p.getPreco())
                        + " x " + p.getEstoque()
                        + "\nValor Total: R$ "
                        + String.format("%.2f", valorTotal)
                );

                total += valorTotal;
            }

            System.out.printf(
                    "\n\nSoma de todos os valores: R$ %.2f%n",
                    total
            );
        }

        pausar();
    }

    // Método para buscar produtos por categoria
    private static void buscarProdutos() {

        System.out.println("------------------------- Buscar Categoria de Produtos -------------------------");

        if (produtos.isEmpty()) {

            System.out.println("\nNão há produtos cadastrados.");

        } else {

            int contador = 0;

            System.out.print("\nDigite a categoria que deseja buscar: ");

            String categoria = sc.nextLine().trim();

            for (Produto p : produtos) {

                if (p.getCategoria().equalsIgnoreCase(categoria)) {

                    System.out.println(p);

                    contador++;
                }
            }

            if (contador == 0) {

                System.out.printf(
                        "\nNão há produtos cadastrados na categoria \"%s\".%n",
                        categoria
                );
            }
        }

        pausar();
    }

    // Método para validar números inteiros e remover espaços
    private static int lerInt(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {

                int valor = Integer.parseInt(sc.nextLine().trim());

                if (valor >= 0) {

                    return valor;

                } else {

                    System.out.println("\nO número deve ser maior ou igual a zero!\n");
                }

            } catch (NumberFormatException e) {

                System.out.println("\nEntrada inválida! Digite um número inteiro.\n");
            }
        }
    }

    // Método para validar números decimais, remover espaços e trocar vírgula por ponto
    private static double lerDouble(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {

                String entrada = sc.nextLine().trim().replace(",", ".");

                double valor = Double.parseDouble(entrada);

                if (Double.isFinite(valor) && valor >= 0) {

                    return valor;

                } else {

                    System.out.println("\nDigite um número válido e maior ou igual a zero.\n");
                }

            } catch (NumberFormatException e) {

                System.out.println("\nEntrada inválida! Digite um número decimal.\n");
            }
        }
    }

    // Método para pausar o sistema até o usuário pressionar ENTER
    private static void pausar() {

        System.out.println("\nPressione ENTER para continuar...\n");

        sc.nextLine();
    }
}
