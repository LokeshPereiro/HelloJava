public class MetodosObjString {
    public static void main(String[] args) {
        String nombre = "Lokesh Pereiro";
        String heroe = "Spidermani";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Lokesh Pereiro\") = " + nombre.equals("Lokesh Pereiro"));
        System.out.println("nombre.equalsIgnoreCase(\"loKesh perEiro\") = " + nombre.equalsIgnoreCase("loKesh perEiro"));
        System.out.println("nombre.compareTo(\"Lokesh Pereiro\") = " + nombre.compareTo("Lokesh Pereiro")); // Si es identico 0, sino numeros unicode
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2)); //K
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); //Ultimo caracter -> o
        System.out.println("nombre.substring(5) = " + nombre.substring(5));// h Pereiro: También incluye la posicion indicada
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2, 5)); // kes -> la última posición indicada no lo incluye
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        System.out.println("heroe.replace(\"m\", \"y\") = " + heroe.replace("m", "y"));
        System.out.println("heroe.indexOf(\"d\") = " + heroe.indexOf('d'));
        System.out.println("heroe.lastIndexOf('i') = " + heroe.lastIndexOf('i'));
        System.out.println("heroe.contains(\"z\") = " + heroe.contains("z"));
        System.out.println("heroe.startsWith(\"Spi\") = " + heroe.startsWith("Spi"));
        System.out.println("heroe.endsWith(\"man\") = " + heroe.endsWith("man"));

        System.out.println("nombre.trim = " + nombre.trim());
        String img = "imagen_random.jpeg";
        //int i = img.indexOf('.');
        int i = img.lastIndexOf('.');
        System.out.println("img.substring(i+1) = " + img.substring(i+1)); //A partir de la posición del índice
    }
}
