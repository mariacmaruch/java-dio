package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

    public static void main(String[] args) {

        List<Nomes> estudantes = new ArrayList<>();

        estudantes.add(new Nomes("Larissa", 19));
        estudantes.add(new Nomes("Mariana", 27));
        estudantes.add(new Nomes("Carlos", 16));
        estudantes.add(new Nomes("Sofia", 18));
        estudantes.add(new Nomes("Barbara", 13));
        estudantes.add(new Nomes("João", 17));

        System.out.println("Quantidade de estudantes: " + estudantes.stream().count());

        System.out.println("Estudantes com idade superior ou igual a 18: " + estudantes.stream().filter(est -> est.getIdade() >= 18).collect(Collectors.toList()));

        System.out.println("Elementos: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Estudantes com nome que possui a letra B: " + estudantes.stream().filter(est -> est.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Estudante mais velho: " + estudantes.stream().max(Comparator.comparingInt(Nomes::getIdade)));
        System.out.println("Estudante mais velho: " + estudantes.stream().min(Comparator.comparingInt(Nomes::getIdade)));
    }
}
