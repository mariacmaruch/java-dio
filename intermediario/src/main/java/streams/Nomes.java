package streams;

public class Nomes {

    private final String nome;
    private final Integer idade;

    public Nomes(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String toString(){
        return nome + " - " + idade;
    }

    public int compareTo(Nomes o){
        return this.getIdade() - o.getIdade();
    }
}

