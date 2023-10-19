public class SentenciaDoWhile {
    //! En la sentencial switch: break es muy importante para que no siga ejecutándose, de otra manera, nos dará resultados erróneos.
    //* For: Se ejecuta dentro de un inicio y final
    //* While: Si la condición es verdadera, el código se ejecuta
    //* Do While: Se ejecuta una vez, y luego chequea la condición

    public static void main(String[] args) {
        /*
        int i = 0;
        while(i< 5){
            System.out.println("i = " + i);
            i++;
        }
        */

        int counter = 0;
        boolean status = true;

        while (status){
            //Tenemos que proveerle un límite sino esto se va a ejecutar infinitivamente.
            if(counter == 10){
                status = false;
            }
            System.out.println(counter + " status = " + status);
            counter++;
        }
        //Esto nunca se va a ejecutar, pues, el status ya es false previamente
        //Tendríamos que hacer el uso de doWhile
        status = false;
       /* while (status){
            System.out.println("Hello World!");
        }
        */
        do{
            System.out.println("Hey, me he ejecutado al menos una vez!!");
        }while(status);

        status = true;
        counter = 0;
        do{
            //Importane ponerle limite sino se ejecuta de manera infinita
            if(counter == 5){
                status = false;
            }
            System.out.println("counter = " + counter);
            counter++;
        } while(status);

    }
}
