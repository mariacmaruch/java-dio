package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {
    public static void main(String[] args) {

        List<Estudantes> estudantes = new ArrayList<>();

        estudantes.add(new Estudantes("Larissa", 9));
        estudantes.add(new Estudantes("Mariana", 7));
        estudantes.add(new Estudantes("Carlos", 6));
        estudantes.add(new Estudantes("Thiago", 8));
        estudantes.add(new Estudantes("João", 7));

        System.out.println("Ordem de inserção: " + estudantes);

        Collections.sort(estudantes, new OrdemComparator());
        System.out.println("Ordem decrescente (comparator): " + estudantes);

        Collections.sort(estudantes);
        System.out.println("Ordem crescente (comparable): " + estudantes);

        estudantes.sort((first, second) -> first.getNota() - second.getNota());
        System.out.println("Ordem crescente (lamda): " + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudantes::getNota).reversed());
        System.out.println("Ordem decrescente (referência de metodo): " + estudantes);
    }
}
