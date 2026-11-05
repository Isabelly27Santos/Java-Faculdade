package Pessoas;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao silva", 20);
        
        System.out.println("Mensagem: " + pessoa.apresentacao());

        Pessoa pessoa2 = new Pessoa();
        
        System.out.println("Mensagem: " + pessoa2.toString());
    }

}