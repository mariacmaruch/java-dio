package dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAtual {

    public static void main(String[] args){

        Date agora = new Date();

        SimpleDateFormat formatar = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:MMM");

        String dataFormatada = formatar.format(agora);

        System.out.println(dataFormatada);

    }
}
