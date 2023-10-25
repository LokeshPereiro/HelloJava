import java.util.Scanner;

public class DetectarOrdenArreglo {
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 5 números:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean asc = false;
        boolean desc = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                desc = true;
            }
            if (a[i] < a[i + 1]) {
                asc = true;
            }
        }

       if(asc && !desc){
           System.out.println("Arreglo Ascendiente!!");
       } else if(!asc && desc){
           System.out.println("Arreglo Descendiente!!");
       } else if(asc && desc){
           System.out.println("Arreglo Desordenado!!");
       } else {
           System.out.println("Todos los números son iguales");
       }
    }
}
