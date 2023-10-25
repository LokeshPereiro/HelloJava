public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"HP Pavilion","Macbook Air", "iPad", "Samsung", "Android", "Windows"};

        //int total = productos.length;

        //int counter = 0;

        /**for(int i = 0; i < total - 1; i++){
            //Va restando las iteraciones que ya los hizo previamente. Por lo que optimizamos el ciclo
            for(int j = 0; j < total - 1 - i; j++){
                if(productos[i].compareTo(productos[j]) < 0){ //compareTo devuelve un entro
                    //Si el valor de i está debajo dell valor j, entercambiamos la posición
                    String temp = productos[i];
                    productos[i] = productos[j];
                    productos[j] = temp;
                }


               if(productos[j + 1].compareTo(productos[j]) < 0){
                    String temp = productos[i];
                    productos[i] = productos[j + 1];
                    productos[j+1] = temp;
                }
                counter++;

            }
        }
        */
        //System.out.println("counter = " + counter);
        /*
        //Nos ordena alfabéticamente
        for(int i = 0; i <total; i++){
            System.out.println("i = " + i + " -> " + productos[i]);
        }
        */

        //int[] numeros = new int[4];
        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortArrBurbuja(productos);
        sortArrBurbuja(numeros);

    }
    public static void sortArrBurbuja(Object[] arreglo){
        int counter = 0;

        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length - 1 - i; j++){
                if(((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0){
                    Object temp = arreglo[i];
                    arreglo[i] = arreglo[j + 1];
                    arreglo[j+1] = temp;
                }
                counter ++;
            }
        }

        //Nos ordena numéricamente
        System.out.println("counter = " + counter);

        for(int i = 0; i <arreglo.length; i++){
            System.out.println("i = " + i + " -> " + arreglo[i]);
        }
    }
}
