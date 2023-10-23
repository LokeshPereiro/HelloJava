import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropsDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties props = new Properties(System.getProperties());
            props.load(archivo);

            props.setProperty("mi.propiedad.personalizada", "El valor guardado en Obj");
            System.setProperties(props);

            //Properties getPros =  System.getProperties();
            System.getProperties().list(System.out);
            System.out.println(System.getProperty("config.puerto.servidor"));
        } catch (Exception e) {
            //System.out.println("No existe el archivo = " + e);
            System.err.println("No existe el archivo = " + e); //Pinta el error en rojo
            System.exit(1); //0: todo salido bien, 1: error de código, -1:error systema
        }

    }
}
