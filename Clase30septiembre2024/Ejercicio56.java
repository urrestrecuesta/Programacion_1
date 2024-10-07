import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        double nota = 0.0;
        int aprobados = 0, noAprobados = 0;

        // Notas de los estudiantes
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("La cantidad de estudiantes: ");
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
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }

        System.out.println("Aprobados: " + aprobados + " No Aprobados: " + noAprobados);
    }

 
    }
