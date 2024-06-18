package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno>  alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a: alunoSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;

                }
            }
            alunoSet.remove(alunoParaRemover);

        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        if (alunoParaRemover == null){
            System.out.println("Matricula não encontrada");
        }

    }
    public void exibirAlunosPorNome(){

        if (!alunoSet.isEmpty()){
            System.out.println("Lista de alunos: ");
            Set<Aluno> alunosPorNome = new TreeSet<>(Comparator.comparing(Aluno::getNome));
            alunosPorNome.addAll(alunoSet);
            for (Aluno aluno:alunosPorNome) {
                System.out.println(aluno);
            }
        }else {
            System.out.println("Lista de alunos vazia");

        }
    }
    public void exibirAlunosPorNota(){
        if (!alunoSet.isEmpty()){
            System.out.println("Lista de alunos: ");
            Set<Aluno> alunosPorMedia = new TreeSet<>(Comparator.comparingDouble(Aluno::getMedia).reversed());
            alunosPorMedia.addAll(alunoSet);
            for (Aluno aluno:alunosPorMedia) {
                System.out.println(aluno);
            }
        }else {
            System.out.println("Lista de alunos vazia");

        }
    }

    public void exibirAlunos(){
        if (!alunoSet.isEmpty()){
            System.out.println("Alunos:");
            for (Aluno aluno : alunoSet){
                System.out.println(aluno);
            }
        }else {
            System.out.println("Lista de alunos varia");
        }
    }
        public static void main(String[] args) {
            GerenciadorAlunos gerenciador = new GerenciadorAlunos();

            // Adiciona alguns alunos
            gerenciador.adicionarAluno("Maria", 123L, 8.5);
            gerenciador.adicionarAluno("João", 456L, 7.2);
            gerenciador.adicionarAluno("Ana", 789L, 9.1);
            gerenciador.adicionarAluno("Pedro", 101L, 6.8);
            gerenciador.adicionarAluno("Carla", 202L, 8.0);
            gerenciador.adicionarAluno("Lucas", 303L, 7.5);

            System.out.println("Todos os alunos:");
            gerenciador.exibirAlunos();
            System.out.println();

            System.out.println("Alunos ordenados por nome:");
            gerenciador.exibirAlunosPorNome();
            System.out.println();

            System.out.println("Alunos ordenados por média:");
            gerenciador.exibirAlunosPorNota();
            System.out.println();

            System.out.println("Removendo o aluno com matrícula 456...");
            gerenciador.removerAluno(456L);
            System.out.println();

            System.out.println("Todos os alunos após remoção:");
            gerenciador.exibirAlunos();
        }
    }

