package contas1;

public class Banco {
  
    public static void main(String[] args) {
        Conta contaJoao = new Conta(); // Cria instância da classe Conta de nome contaJoao
        Conta contaMaria = new Conta(); 

        contaJoao.setNumero("12345-6");
        contaJoao.setTitular("João da Silva");
        //contaJoao.saldo = 195.64; esse atributo saldo é privado, não pode ser acessado diretamente fora da classe Conta

        contaMaria.setNumero("98765-4");
        contaMaria.setTitular("Maria Oliveira");
        //contaMaria.saldo = 2500.00;

        contaJoao.depositar(100.00);
        contaMaria.depositar(200.00);

        System.out.println("CONTA JOAO");
        System.out.println("Saldo: " + contaJoao.getSaldo());

        System.out.println("CONTA MARIA");
        System.out.println("Saldo: " + contaMaria.getSaldo());

        contaJoao.retirar(200.00);
        contaMaria.retirar(50.00);

        System.out.println("CONTA JOAO");
        System.out.println("Saldo: " + contaJoao.getSaldo());

        System.out.println("CONTA MARIA");
        System.out.println("Saldo: " + contaMaria.getSaldo());
    }
}
