package aula09;

import aula10.Pessoa;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;

    @Override
    public String toString() {

        //return super.toString();
        return "toString Medico\n" +super.toString();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    
}
