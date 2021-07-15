package poo_ex3;

public class Funcionarios {

    private double salario;


    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calculaImposto(){
        return getSalario() * 0.2;
    }
}
