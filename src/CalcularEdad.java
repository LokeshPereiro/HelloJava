import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿En qué año naciste?" + "\n Por favor, ponlo de esta manera: día/mes/año");
        String anioUsuario = scanner.next();
        SimpleDateFormat formatStr = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date parseoFecha = formatStr.parse(anioUsuario);
            Date fecha = new Date();

            int fechaUser = parseoFecha.getYear();
            int fechaActual = fecha.getYear();

            int edad = fechaActual - fechaUser;

            System.out.println("Tú edad es: " + edad);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
