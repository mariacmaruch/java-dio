package poo_ex3;

public class Aplicacao {

    public static void main(String[] args){

        Funcionarios pessoa1 = new Gerente();
        pessoa1.setSalario(3500);
        System.out.println("Salário gerente: R$" +  pessoa1.calculaImposto()); //R$350

        Funcionarios pessoa2 = new Supervisor();
        pessoa2.setSalario(2200);
        System.out.println("Salário supervisor: R$" + pessoa2.calculaImposto()); //R$110

        Funcionarios pessoa3 = new Atendente();
        pessoa3.setSalario(1800);
        System.out.println("Salaŕio atendente: R$" + pessoa3.calculaImposto()); //R$18

    }
}
