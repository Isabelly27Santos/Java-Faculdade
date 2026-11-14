package aula10;

public class Paciente extends Pessoa {

    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Paciente(String telefone) {
        this.telefone = telefone;
    }

    
    public Paciente() {
    }

    @Override
    public String toString() {
        return "Paciente: " + getNome() + "\nIdade: " + getIdade() + "\n CPF: " + getCpf() + "\n Telefone: " + telefone +
        "\n---------------------------------";
    }

    
    

    
}
