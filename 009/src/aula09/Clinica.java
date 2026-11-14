package aula09;

public class Clinica {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setNome("João da Silva");
        paciente.setIdade(20);
        paciente.setCpf("525.024.768-79");
        System.out.println("Paciente: " +paciente.toString());

        Medico medico = new Medico();
        medico.setNome("Rodrigo Gomes");
        medico.setIdade(35);
        medico.setCpf("525.044.768-88");
        System.out.println("Médico: " +medico.toString());

        if(Util.cpfValido(medico.getCpf())) {
            System.out.println("CPF do médico válido");
        }
        else {
            System.out.println("CPF do médico inválido");
        }

        Util util = new Util();
        util.mensagem();
        
        System.out.println("Tamanho: " +Util.tamanho);
    }
}


