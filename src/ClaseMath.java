public class ClaseMath {
    public static void main(String[] args) {
        int absouluto = Math.abs(-3);
        //System.out.println(absouluto);

        absouluto = Math.abs(3);
        System.out.println("absouluto = " + absouluto); //Lo mismo que anterior

        double max = Math.max(3.6, 2.7);
        System.out.println("max = " + max);

        //Math.ciel, floor, round, exp, pow, sqrt
        String[] colores = {"rojo", "verde", "amarillo", "azul", "negro", "blanco"};
        double random = Math.random();
        System.out.println("random (less tan 1) = " + random);

        //random *= 7;
        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random floor= " + random);

        System.out.println("colores = " + colores[(int) random]);

        // area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        double area;
        double radio;

        area = Math.PI * Math.pow(2, 2);
        System.out.println("El area del círculo es: " + area);
    }
}
