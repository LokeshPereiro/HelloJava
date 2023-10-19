public class SentenciaFor {
    //! En la sentencial switch: break es muy importante para que no siga ejecutándose, de otra manera, nos dará resultados erróneos.
    //* For: Se ejecuta dentro de un inicio y final
    //* While: Si la condición es verdadera, el código se ejecuta
    //* Do While: Se ejecuta una vez, y luego chequea la condición

    public static void main(String[] args) {
       /* int i = 0;
        for (; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i++ = " + i);
        */
       /* for (int j = 0; j <= 5; j++) {
            if (j % 2 == 0) {
                //continue
                System.out.println("Nº par: " + j);
            } else {
                System.out.println("Nº impar: " + j);
            }
        }
        */

       /* String[] arr = new String[3];
        String arr1[] = {""};
        */
        String[] personas = {"Jaimito", "Pepe", "Pepa", "Alfonso", "Miguel", "Maria", "Manuela", "Rodolfo", "Cris"};
        for(int i = 0; i < personas.length; i++){
            /*
            if(personas[i].equalsIgnoreCase("jaimito") || personas[i].equalsIgnoreCase("miguel")){
                continue;
            }
             */
            if(personas[i].contains("p") || personas[i].contains("r")){
                //* Ojo! El método contains es case sensitive, al igual que, startsWith
                System.out.println( personas[i].toUpperCase()); //Pues, Rodolfo contiene la r pero es mayusculas, por lo que, lo ignora
            }

            System.out.println(i + " = " + personas[i]);

        }

    }
}
