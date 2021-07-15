package java10;

import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;
import java.util.stream.Collectors;

public class InferencialExemplo {
    public static void main(String[] args) {
        printNome("Maria" , "Maruch");
        printSoma(10, 5);
        connectAndPrint();

    }

    private static void connectAndPrint(){
        try {
            var url = new URL("https://docs.oracle.com/");
            var urlConnection = url.openConnection();

            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
         } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printNome(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printSoma(int...  numeros){
        var soma = 0;
        if(numeros.length > 0){
            for (var numero : numeros){
                soma += numero;
            }

            System.out.println(soma);
        }
    }
}
