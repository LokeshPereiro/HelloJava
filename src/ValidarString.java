public class ValidarString {
    public static void main(String[] args) {
        String nombre = null;

        boolean esNulo = nombre == null;
        System.out.println(esNulo); //true
        //System.out.println(nombre.toUpperCase());

        if(esNulo){
            nombre = ""; //cuando hay un espacio en blanco. isBlank
            System.out.println(nombre.toUpperCase());
        }
        boolean esVacio = nombre.isEmpty();
        boolean spacioBlanco = nombre.isBlank(); //Es más estricto que el isEmpty

        // System.out.println("Hola soy ".concat(nombre)); //El método concat solo funciona cuando el obj string tiene instancia que no es nulo.
        String msg = "No hay nada: " + esVacio;
        msg += "\n Hay caracteres: " + spacioBlanco;
        System.out.println(msg);
    }
}

