import java.util.Scanner;

public class EjercicioDowhile {

    public static void main(String[] args) {
        // Parte 1: Ejemplo de do-while
        String cad = "Programacion I";
        int j = 0;
        
        do {
            System.out.println(cad);
            j++;
        } while (j < 5);  // Corrección: cambiar a j < 5 para que se ejecute 5 veces

        System.out.println("************************************************");

        // Parte 2: Contando aprobados y no aprobados
        double nota = 0.0;
        int aprobados = 0, noAprobados = 0;

        // Notas de los estudiantes
        Scanner leer = new Scanner(System.in);
        System.out.print("La cantidad de estudiantes: "); // Cambiar a print para una mejor legibilidad
        int estudiantes = leer.nextInt();

        for (int i = 1; i <= estudiantes; i++) {
            System.out.print("Nota del estudiante " + i + ": ");
            nota = leer.nextDouble();
            if (nota >= 5.0) {
                aprobados++;
            } else {
                noAprobados++;
            }
        }

        System.out.println("Aprobados: " + aprobados + " No Aprobados: " + noAprobados);
        
        leer.close(); // Buenas prácticas: cerrar el Scanner
    }
}