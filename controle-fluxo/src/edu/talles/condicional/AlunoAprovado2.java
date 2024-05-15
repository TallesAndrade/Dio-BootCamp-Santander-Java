package edu.talles.condicional;

public class AlunoAprovado2 {
    public static void main(String[] args) {
        double nota = 6.9;
        
        if (nota >= 7){
            System.out.println("Aluno Aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno em Recuperação");
        }else {
            System.out.println("Aluno Reprovado");
        }
    }
}
