import java.util.Scanner;

public class NumeroMenor {
    static int min = 100000;
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos números enteros quieres comparar (min: 10)");
        int cantidadNumComparar = scanner.nextInt();

        if (cantidadNumComparar < 10) {
            System.out.println("Lo siento, la cantidad debe ser mayor >= a 10");
        } else {
            int numsUser;
            for (int i = 0; i < cantidadNumComparar; i++) {
                int k = i + 1; //Para poner el índice en 1
                System.out.println(k + ". " + "Qué números comparas, entonces?");
                numsUser = scanner.nextInt();
                min = (numsUser < min) ? numsUser : min;
            }
            System.out.println("Eureka! tú número menor es: " + min);

            String msg = (min < 10) ? "El número " + min + " es menor que 10!" : "El número " + min + " es igual o mayor que 10!";
            System.out.println(msg);
        }


        /*int[] valores = {5, 8, 2, 12, 3, 6, 10, 1, 15, 4};
        int menor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        System.out.println("El número menor es: " + menor);
         */


    }
}
