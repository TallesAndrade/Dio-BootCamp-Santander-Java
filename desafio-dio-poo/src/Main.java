import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("Aprendendo progração orientada a objetos");
        curso1.setCargaHorario(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("SpringBoot");
        curso2.setDescricao("Aprendendo framework SpringBoot");
        curso2.setCargaHorario(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre java 8");
        mentoria.getData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java SpringBoot");
        bootCamp.setDescricao("Aprenda a programar com Java e SpringBoot");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);


        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.increverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos "+devJorge.getConteudosIncritos());
        devJorge.progredir();
        System.out.println("Conteudos Concluidos "+devJorge.getConteudosIncritos());


        Dev devCarina = new Dev();
        devCarina.setNome("Carina");
        devCarina.increverBootcamp(bootCamp);
        devCarina.progredir();
        devCarina.progredir();
        System.out.println("Conteudos Inscritos "+devCarina.getConteudosIncritos());
        System.out.println("Conteudos Concluidos "+devCarina.getConteudosIncritos());


    }
}
