public class BuscarElementosMatrices {
    public static void main(String[] args) {
        int[][] matrizNums = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 1305, 1999}
        };
        int elementoBuscar = 5;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar:
        for ( i = 0; i < matrizNums.length; i++) {
            for ( j = 0; j < matrizNums[i].length; j++) {
                if (matrizNums[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if(encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        }
    }
}
