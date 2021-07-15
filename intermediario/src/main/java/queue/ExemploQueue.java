package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String fila: nomes){
            System.out.println(fila);
        }

        String primeiro = nomes.peek();
        System.out.println("Primeiro nome sem remoção: " + primeiro);

        String primeiroRemove = nomes.poll();
        System.out.println("Primeiro nome com remoção: " + primeiroRemove);

        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println("Tamanho da lista:" + nomes.size());
        System.out.println("Está vazia? " + nomes.isEmpty());
        System.out.println("Nome Carlos está na fila? " + nomes.contains("Carlos"));

    }
}