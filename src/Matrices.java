public class Matrices {
    public static void main(String[] args) {
        /*int[][] numeros = new int[2][4];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Filas: números.length = " + numeros.length);
        System.out.println("Columnas; números = " + numeros[0].length);

        System.out.println("Primer elemento de la matriz = " + numeros[0][0]);
        System.out.println("Último elemento = " + numeros[numeros.length - 1][numeros[1].length -1]);
         */

        /*String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Jose";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Josefina";
         */

        //String[][] nombres = {{"Pepe", "Pepa"}, {"Jose", "Paco"}, {"Lucas, Josefina"}};

        /*for(int i = 0; i < nombres.length; i++){
            for(int j = 0;j < nombres[i].length; j++){
                System.out.print(nombres[i][j]+ "\t");
            }
            System.out.println();
        }
         */

        /*for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
         */

        //ColumnasVariables
        int[][] matriz = new int[3][];
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("fila 1 matriz[1].length = " + matriz[1].length);

        for(int i =0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
