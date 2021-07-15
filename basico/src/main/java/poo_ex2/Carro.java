package poo_ex2;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro (String marca, String modelo, Integer ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setVariante(String maodelo){
        this.modelo = modelo;
    }

    public Integer getAno(){
        return ano;
    }

    public void setAno (Integer ano){
        this.ano = ano;
    }


    public void imprimir(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }

}
