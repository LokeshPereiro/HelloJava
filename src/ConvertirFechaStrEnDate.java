import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirFechaStrEnDate {
    public static void main(String[] args) {

        SimpleDateFormat formateo = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fecha = formateo.parse("21/10/2023");
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + formateo.format(fecha));

            Date fechaActual = new Date();

            if(fecha.before(fechaActual)){
                System.out.println("La fecha modificada es MENOR que la fechaActual = " + fecha);
            }else if(fecha.after(fechaActual)){
                System.out.println("La fecha modificada es MAYOR que la fechaActual = " + fechaActual);
            } else if(fecha.equals(fechaActual)){
                System.out.println("Ambas fechas son iguales");
            }
            //* compareTo viene de la interface Comparable del Obj Date
            //* Nos devuelve int -> -1 0 1
            int compararFechas = fecha.compareTo(fechaActual);
            System.out.println("compararFechas = " + compararFechas);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
