package ex3;

public class Atendente extends Funcionarios{

    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
}
