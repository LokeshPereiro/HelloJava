import java.sql.SQLOutput;
import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println(" ---- TODAS LAS varEnv del System ---- ");
        for(String key: varEnv.keySet()){
            System.out.println(key + " ==> " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("Username = " + username);

        String javHome = System.getenv("JAVA_HOME");
        System.out.println("JavaHome = " + javHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("Temp = " + tempDir);

        String path1 = System.getenv("PATH");
        System.out.println("Path1 = " + path1);

        //Podemos obtener las informaciones de las variables del entorno a través del Map definido
        String path2 = varEnv.get("Path"); // Las variables no están en mayúsculas (de hacerlo nos da null)
        System.out.println("Path2 = " + path2);

    }
}
