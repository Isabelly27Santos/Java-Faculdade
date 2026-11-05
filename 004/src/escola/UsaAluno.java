package escola;

import java.util.ArrayList;
import java.util.List;

public class UsaAluno {

public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Joao da Silva", 8.5));
        alunos.add(new Aluno("Maria da Conceicao", 9.0));
        alunos.add(new Aluno("Laura Santos", 10.0));
        alunos.add(new Aluno("Igor Almeida", 7.0));
        alunos.add(new Aluno("Pedro Oliveira", 6.0));
        alunos.add(new Aluno("Ana Costa", 9.5));

        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

}
