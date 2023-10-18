public class Primitivos {
    static double doubleReal;

    public static void main(String[] args) {
        System.out.println("Valor máximo *byte* es: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo *short* es: " + Short.MAX_VALUE);
        System.out.println("Valor máximo *int* es: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo *long* es: " + Long.MAX_VALUE);

        //Correr la coma 3 veces hacia derecha
        float realFloat = 2.12e3f;
        //Correr la coma 34 veces hacia izq
        float realFloat2 = 2.6e-4f; //0.0000264f
        System.out.println(realFloat2);
        System.out.println("Valor máximo *float* es: " + Float.MAX_VALUE);
        System.out.println("Valor máximo *double* es: " + Double.MAX_VALUE);

        //No podemos asIgnar variables sin valor dnetro del método main, sí en la clase correspondiente
        System.out.println(doubleReal);

        //CHAR: tiene que ser con comillas simples
        char caracter = '@';
        char caracterUnicode = '\u0040'; //unicode @
        System.out.println(caracter);
        System.out.println(caracter == caracterUnicode); //true

        //CARACTERES ESPECIALES
        char espacio = ' ';
        char retroceder = '\b';
        char tabular = '\t';
        char nuevaLinea = '\n'; //System.lineSpeparator();
        char borrarAnterior = '\r';

        System.out.println("Mi gustan las tortugas:"+espacio+"Ninja");
        System.out.println("Mi gustan las tortugas:"+retroceder+"Ninja"); //Me quita los dos puntos
        System.out.println("Mi gustan las tortugas:"+nuevaLinea+"Ninja");
        System.out.println("Mi gustan las tortugas:"+borrarAnterior+"Ninja"); //Me borra todo lo anterior al 'Ninja'




    }
}
