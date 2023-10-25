import java.util.Arrays;
import java.util.Scanner;

public class ArregloParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;

        int totalPares = 0;
        int totalImpares = 0;

        a = new int[5];
        System.out.println("Ingresar 5 números:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int par = 0;
        int imp = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[par++] = a[i];
            } else {
                impares[imp++] = a[i];
            }
        }

        System.out.println("---- Pares ----");
        for(int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\n---- Impares ----");
        for(int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
    }
}
