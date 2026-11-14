package aula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula10.Medico;
import aula10.Paciente;
import aula10.Util;

public class Clinica {

    static Scanner scanner = new Scanner(System.in);
    static List<Paciente> pacientes = new ArrayList<>();

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


