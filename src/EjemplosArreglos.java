import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {
        String[] productos = new String[3];
        productos[0] = "HP Pavilion";
        productos[1] = "Macbook Air";
        productos[2] = "iPad";

        Arrays.sort(productos);

        String prod0 = productos[0];
        String prod1 = productos[1];
        String prod2 = productos[2];

        /*System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod0 = " + prod0);
         */

        String[] productos1 = {"HP Pavilion","Macbook Air", "iPad", "Samsung", "Android", "Windows"};

        /* Ciclos imprimir los elementos ordenados y al revés */


        for(int i = 0; i < productos1.length; i++){
            //System.out.println("productos1[i] = " + productos1[i]);
            System.out.println("productos1[i] a la inversa = " + productos1[(productos1.length - 1) - i]);
        }


        /*for (int i = productos1.length - 1; i >=0; i--){
            System.out.println("i inverso = " + productos1[i]);
        }
         */


        /*System.out.println("Ciclo ForEach");
        for(String items: productos1){
            System.out.println("items = " + items);
        }
         */

        /*System.out.println("Ciclo While");
        int k = 0;
        int total = productos1.length;

        while(k < total){
            System.out.println("total productos While = " + productos1[k]);
            k++;
        }
         */

        /*System.out.println("Ciclo While");
        int j = 0;
        int totalj = productos1.length;

        do{
            System.out.println("totalj productos Do While = " + productos1[j]);
            j++;
        }while(j < totalj);
         */

    }
}
