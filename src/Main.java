import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java: ");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js: ");
        curso2.setCargaHoraria(4);




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamo Java Developer. ");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer: ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Renato");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("------------");
        System.out.println("Conteudo Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("#########################################################");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("------------");
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudo Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
