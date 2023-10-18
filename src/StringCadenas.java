public class StringCadenas {
    // Los Strings: son objetos de java, del tipo de referencia
    public static void main(String[] args) {
    String str1 = "Hey! Lokesh";
    String str2 = new String("Hey! Lokesh");

    //¿Teniendo el mismo contenido/ valor son el mismo objeto? --> False
    // No son el mismo objeto, es una instancia del tipo que apuntan a distintas memorias de referencia en el ordenador
    //Compara por referencia
    System.out.println("Son el mismo objeto? " + (str1 == str2));

    //¿Los valores con iguales? --> True
    // Gracias al método equals() pudimos saber si el valor es lo mismo o no
    //Compara por valor
    System.out.println("Tienen el mismo valor? " + str1.equals(str2));

    /*
    ** Métodos de la clase String **
    * int length()
    * boolean equals()
    * boolean equalsIngnoreCase() -> NO tiene en cuenta las mayúsculas y las minúsculas
    * int compareTo() -> nos devuelve -1 0 1
    * String trim()
    * char charAt(int posición) Extrae un carácter en la posición indicada
    * char[] toCharArray() -> Convierte la cadena en un arreglo de caracteres
    * String substring(int a, int b) -> Extrae la sub-cadena entre las posiciones a y b
    * String substring(int a) -> Extrae la sub-cadena desde la posición indicada
    * int indexOf(String cadena) -> Indica en qué posición se encuentra el carácter indicado desde el principio de la cadena
    * boolean startsWith(String prefijo) -> Dice si la cadena comienza con el prefijo indicado* *
    * boolean endsWith(String sufijo) -> Dice si la cadena termina con el sufijo
    * String[] split(String patron) -> Divide la cadena en varias subcadenas utilizando patron indicado como separador
    */
        int numA = 10;
        int numB = 20;
        //Ojo! al tener un string primero, sigue la misma lógica para el resto de las variables, si no lo metemos dentro de unos paréntesis
        System.out.println("Hellow: " + (numA + numB));

        String nombre = "Lokesh";
        String apellido = "Pereiro MF";
        String saludo = "Wey!";

        //No modifica a la variable original nombre sino que nos devuelve una instancia con los resultados
        String fullName = nombre.concat(" ".concat(apellido).concat(" ") + saludo);
        System.out.println(fullName);
        System.out.println(nombre);

       String result = nombre.transform((n) ->{
            return n + " " + apellido + saludo + "!!!";
        });

        System.out.println(result);

        String res = result.replace('e', 'E');
        System.out.println(res);

    /** Rendimiento **/
    String a = "a";
    String b = "b";
    String c = a;
    StringBuilder sb = new StringBuilder(a);

    long inicio = System.currentTimeMillis();

    for (int i = 0; i<500; i++){
        //c = c.concat(a).concat(b).concat("\n");
        //c += a + b + "\n";
        sb.append(a).append(b).append("\n");

        //StringBuilder > Concat>+

        //StringBuilder es mucho más rápido que los dos métodos anteriores.
        //No obstante, si el método concat es menos eficiente en comparación con el + cuando se trata de unir muchos textos en cadena

    }
    long fin = System.currentTimeMillis();

    System.out.println(fin - inicio);
        System.out.println(sb.toString());
    }

}
