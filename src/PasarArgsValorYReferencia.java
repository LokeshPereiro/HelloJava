public class PasarArgsValorYReferencia {
    //! static: se puede invocar sin la necesidad de crear Obj usando su nombre o de forma directa si estamos en otro método static (como el main)
    public static void main(String[] args) {
        //*Los primitivos: int, string, double, boolean, float, short.. siempre se pasa por valor (tienen sus propios clases Wrrapers)
        //*Es decir, da igual si lo pasamos como int or su clase Integer
        //*Pues cuando se modifica su valor, el primitivo crea instancias de su valor original (inmutables);

        //int i = 10;
       // Integer i = 10;
        //System.out.println("Dentro del método main i = " + i);
       // testValor(i);

        int[] edades = {15, 26, 33};
        for (int e = 0; e < edades.length; e++) {
            System.out.println("Edades originales = " + edades[e]);
        }
        testReferencia(edades);

        //Después de modificarlo
        for (int e = 0; e < edades.length; e++) {
            System.out.println("Edades modificados = " + edades[e]);
        }
        testReferencia(edades);

    }

    /*public static void testValor(int i) {
        System.out.println("método test valor heredado = " + i);
        i = 1000;
        System.out.println("método test valor actual= " + i);
    }
     */
    public static void testReferencia(int[] arrEdad) {
        for (int e = 0; e < arrEdad.length; e++) {
            arrEdad[e] = arrEdad[e] + 88;
        }
        System.out.println("método testReferenciar modificado");
    }


}
