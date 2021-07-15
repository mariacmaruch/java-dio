package poo_ex3;

public class Supervisor extends Funcionarios{

    public double calculaImposto() {
        return this.getSalario() * 0.05;
    }
}
