import java.util.Scanner;

public class DetalleDeFactura {
    static double validNum;

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Como es el nombre de la factura?");
            String nombreFactura = scanner.nextLine();

            System.out.println("¿Precio producto A?");
            validNum = scanner.nextDouble();
            double precioA = validNum;

            System.out.println("¿Ahora, precio producto B?");
            validNum = scanner.nextDouble();
            double precioB = validNum;

            double totalBruto = precioA + precioB;
            double totalNeto = totalBruto * 1.19;

            String msg = "El Nombre de la factura es: " + nombreFactura;
            msg += "\n El total ANTES del IVA es de: " + totalBruto;
            msg += "\n El total DESPUÉS del IVA es de: " + totalNeto;
            System.out.println(msg);

        }catch (NumberFormatException e){
            System.out.println("Error! Ingrese un numero válido");
            main(args);
            System.exit(0);
        }


    }
}
