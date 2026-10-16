package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> misTareas = new ArrayList<>();

        int opc = 0;

        while (opc != 4) {
            System.out.println("\n MENU DE TAREAS ");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opc = sc.nextInt();
            sc.nextLine();

            if (opc == 1) {
                System.out.print("Pon la descripcion: ");
                String texto = sc.nextLine();

                Task t = new Task(texto);
                misTareas.add(t);
                System.out.println("Guardada");

            } else if (opc == 2) {
                System.out.println("aqui va la lista");
            } else if (opc == 3) {
                System.out.println("aqui se completa");
            } else if (opc == 4) {
                System.out.println("Adios");
            } else {
                System.out.println("opcion mal");
            }
        }
    }
}