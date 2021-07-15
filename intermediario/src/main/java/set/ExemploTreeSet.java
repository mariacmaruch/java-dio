package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Primeiro número a ser removido: " + numeros.pollFirst());

        numeros.add(23);
        System.out.println("Após a remoção e inserção de um número: " + numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Vazio?  " + numeros.isEmpty());

    }
}
