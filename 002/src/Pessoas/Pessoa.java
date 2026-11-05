package Pessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade) { //obriga a passar nome e idade na criação do objeto
        super();
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com parametros");
    }

    public Pessoa() { 
        super();
        this.nome = "sem nome";
        this.idade = 10;
        this.sexo = 'M';
        System.out.println("Construtor sem parametros");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String apresentacao() {
        return "Ola, meu nome e " + nome + " e tenho " + idade + " anos.";
    }

    @Override 
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }
    
}
