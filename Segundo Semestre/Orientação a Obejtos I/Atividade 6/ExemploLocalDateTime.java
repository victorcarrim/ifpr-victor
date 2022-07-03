import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
    public static void main(String[] args){
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHora.format(formato);
        System.out.println(dataFormatada);

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
        

    }
}
