package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pagamento {
    public static void main(String[] args){

        Calendar pagamento = Calendar.getInstance();
        pagamento.set(2021, Calendar.JULY, 07);
        pagamento.add(Calendar.DATE, 10);

        if(pagamento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            pagamento.add(Calendar.DATE, 2);
        } else if(pagamento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            pagamento.add(Calendar.DATE, 1);
        }

        System.out.println("A data limite para o pagamento é " + pagamento.getTime());
    }

}
