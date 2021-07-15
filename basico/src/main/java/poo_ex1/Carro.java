package poo_ex1;

public class Carro {

    private int qnt;

    public Carro(int qnt){
        this.setQnt(qnt);
    }

    public int getQnt(){
        return qnt;
    }

    public void setQnt(int qnt){
        this.qnt = qnt;
    }

    public void adicionar (int novas){
        this.setQnt(getQnt() + novas);
    }

    public void remover (int pessoas){
        if(this.getQnt() == 0){
            System.out.println("O carro está vazio!");
        } else {
                this.setQnt(getQnt() - pessoas);
            }
        }

    public void imprimir(){
        System.out.println("Pessoas no carro: " + this.getQnt());
    }
}
