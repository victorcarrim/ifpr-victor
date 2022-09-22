import java.io.*;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CalculoEntrega {
    private LocalDate calculada;
    private String data, dataFormatada;

    public String getData(){
        return this.dataFormatada;
    }

    public String setData(String d){
        return this.data = d;
    }


    public void calculaData() {
        try{
            DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate transformada = LocalDate.parse(data, formato1);
            calculada = transformada.plusDays(7);
            dataFormatada = calculada.format(formato1);
        } catch (Exception io){
            throw io;
        }
    }
}
