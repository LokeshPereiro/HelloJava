import java.util.Scanner;

public class AnadirElementosIndice {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion;

        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese nº:");
            a[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Nuevo elemento?");
        elemento = s.nextInt();

        System.out.println("Posición (0-9)?");
        posicion = s.nextInt();

        //Partiendo del penúltimo valor
        for(int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El Resultado");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
