import java.util.Scanner;

public class EliminarElementosArreglo {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese un nº: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese una posición a eliminar (0 - 9)");
        int posicion = s.nextInt();

        for(int i = posicion; i < a.length -1; i++){
            a[i] = a[i+1];
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }
    }
}
