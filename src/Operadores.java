import javax.swing.*;

public class Operadores {
    /** Operadores Aritméticos Vs Operadores de Asignación **/

    public static void main(String[] args) {
    int a = 5, b= 3, sumar = a + b;
        //Casting int to float
        float divFloat = (float) a/b;
     //   System.out.println(divFloat);

        int residuoModulo = a % b;
      //  System.out.println(residuoModulo);

      //  int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un número y te digo si es par o impar!"));

        //Ejemplo Módulos
        // 5 % 2 => 1, cuantos 2s caben dentro del módulo de 5, pues, 2 y me sobra 1
        // 4 % 2 => 0, me caben 2 doses, por lo que el resto es 0

        //Si divido cualquier numero entre dos y me da como resultado 0, entonces, es divisible por dos, por lo que será par.
       /* if(numero % 2 == 0){
            System.out.println("Numero PAR: " + numero);
        } else{
            System.out.println("Numero IMPAR: " + numero);
        }
        */

        /** Operadores de Incremento y Preincremento **/
        int i = 1;
        int j = ++i; // i = i + 1 = 2
        System.out.println("i: "+i);
        System.out.println("j: "+j);

        int k = 2;
        int q = k++; //Primero se asigna a la variable y luego se incrementa(k)
        System.out.println("k: "+k);
        System.out.println("q: "+q);

        k = 3;
        q = k--; // Se queda con el valor de k, luego la k se decrementa en 1
        System.out.println(k);

        int x = 3;
        byte y = 3;
        float z = 127e-7f;
        double l = 2.435555;
        boolean d = false;

        boolean res = x == y || (z < l && d == true); //La precedencia es importante, pues el AND se evalúa antes que el OR
        System.out.println(res); //true
    }
}
