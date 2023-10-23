import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LaClaseRuntimeSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        //Process proceso;
        List<String> lista = new ArrayList<>();
        ProcessBuilder proceso = new ProcessBuilder(lista);
        Process p;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                lista.add("notepad");
                p = proceso.start();
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                lista.add("textedit");
                p = proceso.start();
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                lista.add("gedit");
                p = proceso.start();
            } else {
                lista.add("gedit");
                p = proceso.start();
            }
            p.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Se cerró el editor");
        System.exit(0);
    }
}
