public class ArrOdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] nuevoArr = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }
        int temp = 0;

        for(int i = 0; i < numeros.length - i; i++){
            //System.out.print(numeros[i] + " ");
            //System.out.println(numeros[numeros.length - 1 -i]);
            nuevoArr[temp++] = numeros[i];
            nuevoArr[temp++] = numeros[numeros.length - 1 -i];
        }
        for(int i = 0; i < nuevoArr.length; i++){
           // System.out.println("i = " + i);
            //valores intercalados
            System.out.println(nuevoArr[i]);
        }
    }
}