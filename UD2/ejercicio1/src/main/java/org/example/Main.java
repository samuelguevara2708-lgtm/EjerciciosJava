package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nDame tu cualificacion final entre 0-10: ");
        double nota;

        nota=teclado.nextDouble();

        if(nota < 0 || nota > 10)
        System.out.println("\nLa nota es incorrecta");

        else

            if (nota >= 5)
                System.out.println("Estas aprobado");
            else
                System.out.println("No estas aprobado");





    }
}
