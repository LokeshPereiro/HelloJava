import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        String[] colores = {"rojo", "verde", "amarillo", "azul", "negro", "blanco"};

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        //System.out.println("randomInt = " + randomInt); //todos los enteros positivos y negativos
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomInt colores = " + colores[randomInt]);

    }
}
