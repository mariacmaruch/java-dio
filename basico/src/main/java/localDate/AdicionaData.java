package localDate;

import java.time.LocalDateTime;
import java.time.Month;

public class AdicionaData {

    public static void main(String[] args){

        LocalDateTime data = LocalDateTime.of(2015, Month.MAY, 05, 10, 00);

        LocalDateTime dataFuturo = data.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Data: " + data);
        System.out.println("Data alterada: " + dataFuturo);
    }
}
