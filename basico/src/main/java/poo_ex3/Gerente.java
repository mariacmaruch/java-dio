package poo_ex3;

    public class Gerente extends Funcionarios{

        public double calculaImposto() {
            return this.getSalario() * 0.1;
        }
    }
