package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // Ejercicio 15!!!
        Scanner teclado = new Scanner(System.in);

        double n,d,i,r;

        System.out.println("De que numero quieres las pontencias ?");

        n = teclado.nextDouble();

        System.out.println("Indica la potencia mas alta a la que desea elevar a " + n);

        d = teclado.nextDouble();

        for(i=1; i <= d; i++){
            r = Math.pow(n,i);
            System.out.printf("\n%.0f ^ %.0f = %.0f" ,n, i ,r);
        }


    }
}
