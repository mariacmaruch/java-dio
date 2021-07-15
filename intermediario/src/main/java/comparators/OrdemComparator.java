package comparators;

import java.util.Comparator;

public class OrdemComparator implements Comparator<Estudantes> {

    @Override
    public int compare(Estudantes o1, Estudantes o2) {

        return o2.getNota() - o1.getNota();
    }
}
