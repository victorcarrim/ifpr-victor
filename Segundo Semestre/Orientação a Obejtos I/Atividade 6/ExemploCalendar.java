import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);

        Calendar vcto =  agora;
        vcto.add(Calendar.DATE, 7);
        System.out.println("Vencimento: " + vcto);

        GregorianCalendar hoje = new GregorianCalendar();
        System.out.println("Calendario Gregorianoo: " + hoje);
        System.out.println("Ano: " + hoje.get(Calendar.YEAR));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(hoje.getTime()));
    }
}
