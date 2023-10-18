import javax.swing.*;

public class OperadorInstanceOf {
    //! instanceof: nos permite saber si una instancia/objeto es referencia de algun tipo. Ex. de una clase, de una interfaz, clases abstractas, subtipo...
    //* Cada primitivo tiene su clase de referencia. En mayúsculas es un obj, en minusculas primitivo normal. Por su parte, String siempre es un objeto o de referencia
    //! Todos los primitivos son objetos que están contenidos dentro de clases genéricos/abstractos, y dentro de ellas sus tipos
    public static void main(String[] args) {
        String text = "Es un Obj de la clase String..";

        Integer num = 7;

        boolean b1 = text instanceof Object;
        boolean b2 = text instanceof String;
        System.out.println("Texto es del tipo Obj " + b1);
        System.out.println("Texto es del tipo String " + b2);

        boolean b3 = num instanceof Object;
        boolean b4 = num instanceof Number;
        boolean b5 = num instanceof Integer;

        System.out.println("Num es del tipo Obj " + b3);
        System.out.println("Num es del tipo Number " + b4);
        System.out.println("Num es del tipo Integer " + b5);

        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");


    }
}
