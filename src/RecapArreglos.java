import java.util.Scanner;

public class RecapArreglos {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int[] resultArr = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 7 números enteros!");

        int counter = 0;
        //Del final al principio intercalado
        /*for (int i = 0; i < arr.length; i++){
            counter++;
            System.out.println("Número: " + counter);
            arr[i] = scanner.nextInt();
        }

        int temp = 0;
        for(int i = 0; i < arr.length - i; i++){
            //numero desc
           resultArr[temp++] = arr[arr.length - 1 - i];

            //Número asc
            resultArr[temp++] = arr[i];
        }
        
        for(int i = 0; i < resultArr.length; i++){
            System.out.println("resultArr[i] => " + resultArr[i]);
        }
         */

        //Obtener número máximo
        /*for (int i = 0; i < arr.length; i++){
            counter++;
            System.out.println("Números entre 11 y 99: " + counter);
            arr[i] = scanner.nextInt();
            if(arr[i] < 11 || arr[i] > 99){
                System.out.println("Error! Ingrese los números entre (11-99)");
                System.exit(-1);
            }
        }

        int max = 0;
        int mayor = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            //max = (arr[max] > arr[i]) ? max : i;
            mayor = Math.max(mayor, arr[i]);

        }
        System.out.println("El número mayor o max del arr[mayor] es = " + mayor);
         */

        /*int sumaNumPositivos = 0, contarPositivos = 0, sumaNumNegativos = 0, contarNegativos = 0, contarCeros = 0;
        for(int i = 0; i < arr.length; i++){
            counter++;
            System.out.println("Números entre -100 al 100: " + counter);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                contarCeros++;
            } else if (arr[i] > 0) {
                contarPositivos++;
                sumaNumPositivos += arr[i];
            } else {
                contarNegativos++;
                sumaNumNegativos += arr[i];
            }
        }

        if(contarPositivos != 0 && contarNegativos != 0){
            System.out.println("\n El promedio (+) de los números positivos es = " + sumaNumPositivos/contarPositivos);
            System.out.println("El promedio (-) de los números negativos es = " + sumaNumNegativos/contarNegativos);
        } else{
            System.out.println("No se puedo sacar el promedio!");
        }
        System.out.println("En el arreglo tenemos = " + contarCeros + " ceros");
         */

        //Mayor ocurrencia de los números

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int repes = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repes++;
                }
            }

        //System.out.println("repes = " + repes);
            resultArr[i] = repes;
        }
        int indice = 0;
        int max = 0;

        for(int i = 0; i < resultArr.length; i++){
            if(max < resultArr[i]){
                max = resultArr[i];
                indice = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arr[indice]);
        System.out.println("el elemento " + arr[indice] + " esta repetido " + max + " veces!");
    }
    }

