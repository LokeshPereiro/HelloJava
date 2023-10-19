public class SentenciaForEachYEtiquetas {
    //* Ventajas forEach: Se obtienen los elementos del arreglo a través de una expresión landa
    //* Esto quiere decir que, no necesitamos contadores o evaluar una condición ni incrementar el contador.
    //* Simplemente, se recorre cada elemento de forma automática del arreglo o del objeto collections
    public static void main(String[] args) {
        String[] personas = {"Jaimito", "Pepe", "Pepa", "Alfonso", "Miguel", "Maria", "Manuela", "Rodolfo", "Cris"};

        //! ForEach
        /*for (String nombre : personas) {
            System.out.println("nombre = " + nombre);
        }
         */

        //!Bucles con etiquetas
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
            //En cada iteración del padre, se ejecuta el for por completo del hijo
            //Por otro lado, la iteración 2 nunca se va a dar, pues, se lo salta.
        }
        System.out.println("\n------------------- 2º bucle -------------------");
        //Días de la semana: i=días, j=8horas
        bucle2:
        for (int i = 1; i <=7; i++) {
            int j = 1;
            while (j <=8 ) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": Finde Semana, descansad!");
                    continue bucle2;
                }
                System.out.println("Día " + i + ", trabajando " + j + " horas");
                j++;
            }
        }
    }
}
