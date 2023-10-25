import java.util.Scanner;

public class ObtenerNumMayorArreglo {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 5 enteros ");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            //max de primeras vale 0 y se va incrementando
            //El elemento del indice a[0] es mayor que el siguiente ?
            //Entonces tomamos su valor, de lo contrario el valor del max (que parte de 0, suponiendo el max es el primer valor ingresado)
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("El número mayor o max del a[max] es = " + a[max]);
    }
}
