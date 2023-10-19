import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hello World!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getClass() = " + strClass);
        System.out.println("strClass.getClass() = " + strClass.getClass());
        System.out.println("strClass.getClass() = " + strClass.getName());
        /* for (Method metodos : strClass.getMethods()) {
            System.out.println("metodos.getName() = " + metodos.getName());
        }
        */
        Integer num = 45;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName()); //Integer
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //Number
        System.out.println("intClass.getSuperclass() Obj = " + intClass.getSuperclass().getSuperclass()); //Number
        System.out.println("objClass = " + objClass);

        for (Method metodos : objClass.getMethods()) {
            System.out.println("metodos.getName() = " + metodos.getName());
        }
    }
    
}
