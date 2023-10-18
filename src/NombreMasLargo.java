import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("Dame un nombre y apellido");
        String p2 = JOptionPane.showInputDialog("Dame otro nombre y apellido");
        String p3 = JOptionPane.showInputDialog("Último un nombre y apellido");

        String nombre1 = p1.split(" ")[0];
        String nombre2 = p2.split(" ")[0];
        String nombre3 = p3.split(" ")[0];

       String nombreGrande = nombre1.length() > nombre2.length() ? p1 + " tiene el nombre más grande" : p2 + " tiene el nombre más grande";
        nombreGrande = nombreGrande.length() > nombre3.length() ? nombreGrande : p3 + " tiene el nombre más grande";

       System.out.println(nombreGrande);
    }
}

