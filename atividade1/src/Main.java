
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Superclasse
class Veiculo {
    private char tipo;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n------------------ Veículo ------------------"
                + "\nTipo: " + tipo
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nPreço: R$ " + preco;
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nQuantidade de portas: " + portas;
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    private int cc;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCilindradas: " + cc + " cc";
    }
}

// Classe principal
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        System.out.println("\n\n----------------------- Cadastro de Veículos -----------------------\n");

        // Quantidade de veículos
        int quantidade;

        do {
            quantidade = lerInt("Digite quantos veículos deseja cadastrar (1 até 10): ");

            if (quantidade < 1 || quantidade > 10) {
                System.out.println("Quantidade inválida! Digite um valor entre 1 e 10.\n");
            }

        } while (quantidade < 1 || quantidade > 10);

        // Cadastro dos veículos
        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nCadastro do veículo " + (i + 1) + ":");

            char tipo = lerTipo();

            if (tipo == 'C') {

                Carro carro = new Carro();

                carro.setTipo(tipo);

                System.out.print("Digite a marca do carro: ");
                carro.setMarca(scanner.nextLine());

                System.out.print("Digite o modelo do carro: ");
                carro.setModelo(scanner.nextLine());

                carro.setAno(lerInt("Digite o ano do carro: "));

                carro.setPreco(lerDouble("Digite o preço do carro: R$ "));

                carro.setPortas(lerInt("Digite a quantidade de portas: "));

                veiculos.add(carro);

            } else {

                Moto moto = new Moto();

                moto.setTipo(tipo);

                System.out.print("Digite a marca da moto: ");
                moto.setMarca(scanner.nextLine());

                System.out.print("Digite o modelo da moto: ");
                moto.setModelo(scanner.nextLine());

                moto.setAno(lerInt("Digite o ano da moto: "));

                moto.setPreco(lerDouble("Digite o preço da moto: R$ "));

                moto.setCc(lerInt("Digite a cilindrada da moto (cc): "));

                veiculos.add(moto);
            }
        }

        System.out.println("\nCadastro dos " + quantidade + " veículos realizado com sucesso!");

        // Pesquisa por preço mínimo
        double precoMin = lerDouble("\nInforme um preço mínimo: R$ ");

        boolean encontrou = false;

        System.out.println("\n------------------ Resultado da Pesquisa ------------------");

        // Filtra os veículos
        for (Veiculo v : veiculos) {

            if (v.getPreco() > precoMin) {

                encontrou = true;

                System.out.println(v);
            }
        }

        // Verifica se encontrou veículos
        if (!encontrou) {
            System.out.println("\nNenhum veículo encontrado acima do preço mínimo informado.");
        }

        scanner.close();
    }

    // Método para validar o tipo do veículo
    private static char lerTipo() {

        while (true) {

            System.out.print("Digite o tipo (C para carro, M para moto): ");

            String entrada = scanner.nextLine().trim().toUpperCase();

            if (entrada.equals("C") || entrada.equals("M")) {
                return entrada.charAt(0);
            }

            System.out.println("Tipo inválido! Digite C ou M.\n");
        }
    }

    // Método para validar números inteiros
    private static int lerInt(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {
                return Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.\n");
            }
        }
    }

    // Método para validar números decimais
    private static double lerDouble(String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {
                String entrada = scanner.nextLine().trim().replace(",", ".");

                double valor = Double.parseDouble(entrada);

                if (Double.isFinite(valor)) {
                    return valor;
                }

                System.out.println("Digite um número válido.\n");

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número decimal.\n");
            }
        }
    }
}
