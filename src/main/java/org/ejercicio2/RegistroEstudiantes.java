package main.java.org.ejercicio2;

import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[20];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese los datos del estudiante #" + (i + 1));
            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            estudiantes[i] = new Estudiante(nombres, apellidos, promedio);
        }

        Estudiante mayor = estudiantes[0];
        Estudiante menor = estudiantes[0];

        for (Estudiante e : estudiantes) {
            if (e.promedio > mayor.promedio) {
                mayor = e;
            }
            if (e.promedio < menor.promedio) {
                menor = e;
            }
        }

        System.out.println("\nEstudiante con el promedio más alto:");
        System.out.println(mayor.nombres + " " + mayor.apellidos + " - Promedio: " + mayor.promedio);

        System.out.println("\nEstudiante con el promedio más bajo:");
        System.out.println(menor.nombres + " " + menor.apellidos + " - Promedio: " + menor.promedio);

        scanner.close();
    }
}
