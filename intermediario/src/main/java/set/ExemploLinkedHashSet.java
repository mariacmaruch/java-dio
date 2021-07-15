package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        numeros.remove(3);
        numeros.add(23);
        System.out.println("Após a remoção e inserção de um número: " + numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Vazio?  " + numeros.isEmpty());

    }
}
