package aula09;

import aula10.Pessoa;

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
        return "Paciente [telefone=" + telefone + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
    }

    
    

    
}
