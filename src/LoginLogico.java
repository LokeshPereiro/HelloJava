import java.util.Scanner;

public class LoginLogico {
    public static void main(String[] args) {
        //Op.1
        /*
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "lokesh";
        usernames[1] = "pepe";
        passwords[0] = "lok123";
        passwords[1] = "pepe123";
        */
        // Op.2
        String[] usernames = {"lokesh", "pepe"};
        String[] passwords = {"lok123", "pepe123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Username?");
        String validUsername = scanner.next();

        System.out.println("¿Password?");
        String validPass = scanner.next();

        boolean esIdentificado = false;

        for (int i = 0; i < usernames.length; i++) {
           /*
           if (usernames[i].equals(validUsername) && passwords[i].equals(validPass)) {
                esIdentificado = true;
                break;
            }
            */
            esIdentificado = (usernames[i].equals(validUsername) && passwords[i].equals(validPass)) || esIdentificado;
        }
        String msg = esIdentificado ? "Bienvenido: ".concat(validUsername).concat("!") : "Credenciales incorrectos!";
        System.out.println(msg);
        /*
        if (esIdentificado) {
            System.out.println("Bienvenido: ".concat(validUsername).concat("!"));
        } else {
            System.out.println("Username o password inválido");
            System.out.println("Ops! Credenciales Inválidos");
        }
         */

    }
}
