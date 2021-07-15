package date;

import java.util.Date;

public class Ex1 {

    public static void main(String[] args){

        Date dataNasc = new Date(1010628000000L);
        Date dataDio = new Date(1273892400000L);

        if (dataNasc.before(dataDio)){
            System.out.println("A data de nascimento é anterior a data informada");
        } else {
            System.out.println("A data de nascimento é posterior a data informada");
        }

    }
}
