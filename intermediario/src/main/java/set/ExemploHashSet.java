package set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(Integer todos: numeros){
            System.out.println(todos);
        }

        numeros.remove(3);
        numeros.add(23);
        System.out.println("Após a remoção e inserção de um número: " + numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Vazio?  " + numeros.isEmpty());

    }
}
