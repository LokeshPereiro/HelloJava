import java.util.Scanner;

public class DesplazarPosicionesArr2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;

        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese nº:");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = s.nextInt();
        System.out.println("En que posición quiere guardar (0-9)");
        posicion = s.nextInt();

        //Guardar el último valor del arr
        ultimo = a[a.length - 1];
        //Partiendo del penúltimo valor
        for(int i = a.length - 2; i >= 0; i--){
            a[i+1] = a[i];
            //La posición 0 ya le asignamos el último valor
            //Por lo que, la posición 1 recibirá valor del 2, asi sucesivamente a[i+1] = a[i] -> a[1+1]
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
        a[posicion] = elemento;
        a[a.length - 1] = ultimo;

        System.out.println("El Resultado");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
