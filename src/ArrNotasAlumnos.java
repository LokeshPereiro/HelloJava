import java.util.Scanner;

public class ArrNotasAlumnos {
    public static void main(String[] args) {
        double[] notasMatematicas, notasHistoria, notasLengua;
        double sumNotasMates = 0, sumNotasHistoria = 0, sumNotasLengua = 0;

        notasMatematicas = new double[5];
        notasHistoria = new double[5];
        notasLengua = new double[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresas las notas de Mates:");
        for(int i = 0; i < notasMatematicas.length; i++){
            notasMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("ingresas las notas de Historia:");
        for(int i = 0; i < notasHistoria.length; i++){
            notasHistoria[i] = scanner.nextDouble();
        }

        System.out.println("ingresas las notas de Lengua:");
        for(int i = 0; i < notasLengua.length; i++){
            notasLengua[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++){
            sumNotasMates += notasMatematicas[i];
            sumNotasHistoria += notasHistoria[i];
            sumNotasLengua += notasLengua[i];
        }

        double promedioMates = sumNotasMates/notasMatematicas.length;
        double promedioHistoria = sumNotasHistoria/notasHistoria.length;
        double promedioLengua = sumNotasLengua/notasLengua.length;

        System.out.println("Promedio clase Matemáticas: " + promedioMates);
        System.out.println("Promedio clase Historia: " + promedioHistoria);
        System.out.println("Promedio clase Lengua: " + promedioLengua);
        System.out.println("Promedio Curso: " + (promedioMates + promedioHistoria + promedioLengua)/3);

        System.out.println("Ingresar identificador alumno (0-5)");
        int id = scanner.nextInt();

        double promedioAlumno = (notasMatematicas[id] + notasHistoria[id] + notasLengua[id]) / 3;
        System.out.println("El promedio del alumno nº " + id + " es: " + promedioAlumno);


    }
}
