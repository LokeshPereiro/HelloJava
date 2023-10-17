public class CastingStringToPrimitivos {
    //Casting: is changing the logical type of a value from one type to another. "Cambiar un tipo a otro".--> Se necesita la clase correspondiente
    //Parsing: is the process of converting the string representation of a type into an instance of the type so that we can operate.
    public static void main(String[] args) {
        /* Parsing String */

        String numString = "50";

        int numInt = Integer.parseInt(numString);
        short numShort = Short.parseShort(numString);

        String realStr = "98855.45";
        double realDouble = Double.parseDouble(realStr);

        String boolString = "true";

        boolean boolStr = Boolean.parseBoolean(boolString);
        System.out.println(boolStr);

        /* Primitivos en String */
        int numRandom = 88;
        //Hay dos formas de hacerlo
        //Con la clase Wrapper String con el método correspondiente
        String numStr = Integer.toString(numRandom);
        System.out.println(numStr);

        //Clase normal del String que recibe un entero y devuelve un string
        //Hay dos enteros por lo que podemos operar
        numStr = String.valueOf(numRandom*2);
        System.out.println(numStr+2); //1762, Pero al resultado no porque ya es un string



        /* Casting de primitivos **/
        int i = 32768;
        short s = (short)i;
        System.out.println(s); //NO nos lo convierte, va a ser negativo ya que el valor max de short es 32767

        long l = i;
        System.out.println(l); // En el long no habría ningún problema ya que el Long tiene capacidad para hacerlo

        //Como es de esperar el casting tiene que ser del mismo tipo, es decir, no tiene sentido convertir un entero a un boolean
        //A parte de los decimales, Char también lo soporta
        char ch = (char)i;
        System.out.println(ch); //El resultado va a ser su relación con la tabla unicode y el caracter correspondiente

    }
}
