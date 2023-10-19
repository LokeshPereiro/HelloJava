public class BuscarCaracteresConSentencias {
    public static void main(String[] args) {
        /*
        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';

        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el char " + letra + " en la frase!");
         */
        String frase = "tres tristes tigres tragan trigo trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;
        int cantidad = 0;
        char letra = 't';

        buclePadre:
        for (int i = 0; i <= maxFrase; i++) {
            //El padre itera hasta encontrar el primer carácter, luego continúa el hijo con su segunda letra para que haga continue en el padre
            //La variable i no puede ser estático como antes. Pues, tiene que ir tomando nuevos valores para que el hijo busque todas las palabras en el padre.
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                //Si el hijo encuentra la letra, se vuelve a iterar, de otra manera hace el continue hasta que el papa encuntre la letra en común
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buclePadre;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra" + palabra + " en la frase!");
    }
}
