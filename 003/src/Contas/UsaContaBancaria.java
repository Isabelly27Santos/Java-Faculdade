package Contas;

public class UsaContaBancaria {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria("Maria de Souza", "98765-4");
        ContaBancaria conta3 = new ContaBancaria("Carlos Oliveira", "54321-0", 1000.0);
        
        conta1.setNumero("12345-6");
        conta1.setTitular("Joao da Silva");
        conta1.setSaldo(0.0);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());

        conta1.depositar(500.0);
        System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
        
        if (conta1.retirar(200.0)) {
            System.out.println("Retirada realizada com sucesso.");
        } else {
            System.out.println("Nao foi possivel realizar a retirada.");
        }
        System.out.println("Saldo atual da conta1: " + conta1.getSaldo());

        try {
            conta1.retirar1(600.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());  
        }

        System.out.println(conta1.toString());
        for (Transacao transacao : conta1.getHistorico()) {
        System.out.println(transacao);
        }

    }

}
