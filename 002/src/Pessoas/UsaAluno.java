package Pessoas;

public class UsaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao silva", 8.5, 7.0, 9.0);
        
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        System.out.println("Media: " + aluno.Media());
        System.out.println("Situacao: " + aluno.situacao());
    }

}
