import java.util.Scanner;

public class RecapString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Como se llama tu PADRE?");
        String papa = scanner.nextLine();
        String papaNombre = papa.toUpperCase().charAt(1) + "." + papa.substring(papa.length() - 2);
        System.out.println(papaNombre);

        System.out.println("Como se llama tu MADRE?");
        String mama = scanner.nextLine();
        String mamaNombre = mama.toUpperCase().charAt(1) + "." + mama.substring(mama.length() - 2);
        System.out.println(mamaNombre);

        System.out.println("Como te llamas TÚ?");
        String hijo = scanner.nextLine();
        String hijoNombre = hijo.toUpperCase().charAt(1) + "." + hijo.substring(hijo.length() - 2);
        System.out.println(hijoNombre);

        String msg = "Resultado NombrePapa: " + papaNombre;
        msg += "\n Resultado NombreMama: " + mamaNombre;
        msg += "\n Resultado NombreHijo: " + hijoNombre;

        System.out.println(msg);
        System.out.println(papaNombre + '-' + mamaNombre + '-' + hijoNombre);
    }
}
