package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String estado = "Graza";


        System.out.println("Indica la acción: falta leve, falta grave o arrepentimiento");
        String accion = teclado.nextLine();

        if (estado.equals("Graza")) {
            if (accion.equals("falta leve")) {
                estado = "Leve";
            } else if (accion.equals("falta grave")) {
                estado = "Grave";
            }
        } else if (estado.equals("Leve")) {
            if (accion.equals("falta grave")) {
                estado = "Grave";
            } else if (accion.equals("arrepentimiento")) {
                estado = "Graza";
            }
        } else if (estado.equals("Grave")) {
            estado = "Grave";
        }

        System.out.println("Estado actual: " + estado);



    }
}
