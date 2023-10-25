public class CombinarArreglos {
    public static void main(String[] args) {
        int[] a, b, c;

        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Primer arr que imprimirá 1 al 10
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        //Segundo que imprimirá 5 al 50
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int temp = 0;
        //En cada vuelta, interación nos imprime un valor de cada for anteriores
        /*for (int i = 0; i < b.length; i++) {
            c[temp++] = a[i];
            c[temp++] = b[i];
        }
         */

        //En cada iteración, da dos vueltas para añadir los valores de cada arreglo
        //Con lo cual, en cada iteración se añden 4 elementos, 2 de cada arr
        for (int i = 0; i < b.length; i += 2) {
            // j < 2 porque se dan dos vueltas en el arreglo a / b para extraer sus valores
            for (int j = 0; j < 2; j++) {
                c[temp++] = a[i + j]; // i=0, j=0 -> c[0] = j[0] // i=0 j=1 -> c[1] = j[1] ...
                //Hay que pensar que el temp se incrementa en cada vuelta independientemente de los for.
                //Es decir, después de valor temp=1, temp=2 por lo que, j también se incrementa y llega a valer 2,
                // por lo que, se sale del for y continúa con el otro..
            }
            for (int j = 0; j < 2; j++) {
                c[temp++] = b[i + j];
            }

        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
