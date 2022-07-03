import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExemploDate {

    public static void main(String[] args){
        Date agora = new Date(); // criação do objeto de data/hora
        System.out.println(agora);

        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = simple.format(agora);
        System.out.println(dataFormatada);

        Date data = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(data));
    }
}
