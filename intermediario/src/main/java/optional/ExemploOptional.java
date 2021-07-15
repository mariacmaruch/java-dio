package optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello World");

        opt.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        opt.map((valor) -> valor.concat("!!!")).ifPresent(System.out::println);

        if(opt.isPresent()){
            String valorNovo = opt.get();
            System.out.println(valorNovo);
        }

        Optional<String> optEmpty = Optional.empty();

        if (optEmpty.isEmpty()){
            System.out.println("Optional vazio");
        }

        optEmpty.orElseThrow(IllegalStateException::new);

        Optional<String> optNull = Optional.ofNullable(null);

    }

}
