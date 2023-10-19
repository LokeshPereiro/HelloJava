class Persona{
    private String nombre;

    public void asignarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return nombre;
    }
}

public class PasarArgsReferenciaClass {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.asignarNombre("Chanchito");
        System.out.println("persona.leerNombre() Antes = " + persona.leerNombre());

        //Después
        modificarNombre(persona);
        System.out.println("persona.leerNombre() Después = " + persona.leerNombre());
    }

    public static void modificarNombre(Persona persona){
    //! Por lo tanto, cuando pasamos una referencia cambia el estado/atributo del Objeto Original
        persona.asignarNombre("Jaimito");
    }
}
