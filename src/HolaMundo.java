import java.util.Arrays;

//Tanto las clases como los archivos que los contienen tienen que ser en PascalCase
public class HolaMundo {
public static void main(String[] args) {
        String saludar = "Hola mi gente, mi nombre es Lokesh Pereiro";

        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        /*
        int numero = 10;
        System.out.println(numero + 40);
         */

        boolean valor = true;

        int num = 1;

        //El contexto donde se defina la variable es importante para acceder a su valor
        if(valor){
            System.out.println("True wey!");
            num=100;
            System.out.println(num); // 100
        }else{
            System.out.println("False wey!!");
            System.out.println(num); //1
        }

        //Var -> según el tipo de dato asignado, ese será su valor/tipo
        var tipoVar = 10;
         System.out.println(tipoVar); //Var a ser un int con el valor 10

        var tipoVar2 = "10";
        System.out.println(tipoVar2 + "hola"); //String: 10hola
}
}
