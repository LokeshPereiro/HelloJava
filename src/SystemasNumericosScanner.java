import javax.swing.*;
import java.util.Scanner;

public class SystemasNumericosScanner {
    public static void main(String[] args) {
        //Obetner los datos desde la terminal

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número entero:");
        String numeroStr =  scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e) {
            System.out.println("Error! Ingrese un numero entero");
            main(args);
            System.exit(0);
        }


        String msg = "numeroDecimal: " + numeroDecimal + " en Binario es: " + Integer.toBinaryString(numeroDecimal);
        msg += "\nnumeroDecimal: " + numeroDecimal + " en Octal es: " + Integer.toOctalString(numeroDecimal);
        msg += "\nnumeroDecimal: " + numeroDecimal + " en Hexadecimal es: " + Integer.toHexString(numeroDecimal);
        //JOptionPane.showMessageDialog(null, msg);
        System.out.println(msg);
    }
}
