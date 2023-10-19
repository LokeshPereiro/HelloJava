import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha.getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyy G 'at' HH:mm:ss z");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String dateFormatStr = dateFormat3.format(fecha);
        System.out.println("dateFormatStr = " + dateFormatStr);

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        Date fecha2 = new Date();

        long milisegundosBucle = fecha2.getTime() - fecha.getTime();
        System.out.println("milisegundosBucle = " + milisegundosBucle);
    }
}
