import javax.swing.*;

public class SystemasNumericos {
    public static void main(String[] args) {
        //int numeroDecimal = 500;
        String numeroStr =  JOptionPane.showInputDialog(null, "Dame un número");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error! Ingrese un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal en Binario es: " + Integer.toBinaryString(numeroDecimal)); //111110100
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);


        System.out.println("numeroDecimal en Octal es: " + Integer.toOctalString(numeroDecimal)); //764
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);


        System.out.println("numeroDecimal en Hexadecimal es: " + Integer.toHexString(numeroDecimal)); //1f4
        int numeroHexa = 0x1f4;
        System.out.println("numeroHexa = " + numeroHexa);

        String msg = "numeroDecimal: " + numeroDecimal + " en Binario es: " + Integer.toBinaryString(numeroDecimal);
        msg += "\nnumeroDecimal: " + numeroDecimal + " en Octal es: " + Integer.toOctalString(numeroDecimal);
        msg += "\nnumeroDecimal: " + numeroDecimal + " en Hexadecimal es: " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, msg);
    }
}
