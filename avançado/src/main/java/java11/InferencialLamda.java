package java11;

import java.util.function.Function;

public class InferencialLamda {
    public static void main(String[] args) {
        Function<Integer, Integer> divisao = (var numero) -> numero/2;
        System.out.println(divisao.apply(10));
    }
}
