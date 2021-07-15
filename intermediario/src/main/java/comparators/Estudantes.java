package comparators;

public class Estudantes  implements Comparable<Estudantes>{


        private final String nome;
        private final Integer nota;

        public Estudantes (String nome, Integer nota){
            this.nome = nome;
            this.nota= nota;
        }
        public String getNome(){
            return nome;
        }
        public Integer getNota(){
            return nota;
        }

        public String toString(){
            return nome + "= " + nota;
        }

        @Override
        public int compareTo(Estudantes o) {
            return this.getNota() - o.getNota();
        }

}

