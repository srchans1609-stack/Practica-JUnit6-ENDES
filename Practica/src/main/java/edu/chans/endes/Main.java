package edu.chans.endes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon tu nombre");
                String nombre = scanner.nextLine();
        System.out.println("Pon el numero de incidencias abiertas");
                int open =  scanner.nextInt();
        System.out.println("Pon el numero de incidencias cerradas");
                int close = scanner.nextInt();

        int total = open + close;

        System.out.println("\n--- resumen de incidencias ---");
        System.out.println("Nombre de usuario: " + nombre);
        System.out.println("Incidencias abiertas: " + open);
        System.out.println("Incidencias cerradas: " + close);
        System.out.println("Total de incidencias: " + total);

        System.out.println("---------------------------------------------");
        if (open > 0) {
            System.out.println("Hay incidencias abiertas");
        }
        else {
            System.out.println("Trabajo realizado");
        }
        scanner.close();

    }
}
