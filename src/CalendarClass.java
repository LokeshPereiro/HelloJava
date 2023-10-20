import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    //! Se trata de una clase abstracta, es decir, no se puede instanciar con la palabra reservada new.
    //* Su propio método estático se encarga de instanciarlo
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //Podemos modificar todo el calendario en una sola línea
        calendario.set(2030, 0, 8, 16, 45);
        //O ir de una en una
        //calendario.set(Calendar.YEAR, 2024);
        Date fecha = calendario.getTime(); //new Date
        System.out.println("fecha = " + fecha);

    }
}
