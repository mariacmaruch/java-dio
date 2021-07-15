package list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String cadaNome: nomes) {
            System.out.println(cadaNome);
        }
        nomes.set(2, "Roberto");

        System.out.println("Nome na posição 1: " + nomes.get(1));

        nomes.remove(4);
        nomes.remove("João");
        nomes.size();

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println("Possui o nome Juliano na lista? " + temJuliano);

        List<String> nomesNova = new ArrayList<>();

        nomesNova.add("Ismael");
        nomesNova.add("Rodrigo");

        nomes.addAll(nomesNova);

        System.out.println(nomes);

        boolean vazia = nomes.isEmpty();
        System.out.println("A lista está vazia? " + vazia);


    }
}
