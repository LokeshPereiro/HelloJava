import java.util.Scanner;

public class BuscarNumerosYStringsArreglo {
    public static void main(String[] args) {
        int[] a = {33, 12, 55, 8, 9, 23, 100, 99, -2, -50};
        String[] str = {"Perro", "Gato", "Caballo", "Burro", "Gallinas", "Cerdo"};

        /*
        System.out.println("Qué número quieres buscar?");
        Scanner scanner = new Scanner(System.in);

        int numBuscar = scanner.nextInt();
        int i = 0;
        //Solo iterar cuando i es menor al largo del arreglo y los valores del i distintos al buscado
        while(i < a.length && a[i] != numBuscar){
            i++;
        }

        if(i == a.length){ //indice max arreglo
            System.out.println("No se encontro el número dentro del Arreglo definido!");
        } else if (a[i] == numBuscar) {
            System.out.println("Se encontro el nº " + numBuscar + " en la posición: " + i);
        }
         */

        System.out.println("Qué animal doméstico buscas?");
        Scanner scanner = new Scanner(System.in);

        String animalBuscar = scanner.nextLine();
        int i = 0;
        //for (; i < str.length && !str[i].equalsIgnoreCase(animalBuscar); i++) {
        //}

        while (i < str.length && !str[i].equalsIgnoreCase(animalBuscar)) {
            i++;
        }

        if (i == str.length) {
            System.out.println("Animal no encontrado");
        } else if (str[i].toLowerCase().compareTo(animalBuscar.toLowerCase()) == 0) {
            System.out.println("El animal " + animalBuscar + " se encontro en la posición: " + i);
        }
    }
}
