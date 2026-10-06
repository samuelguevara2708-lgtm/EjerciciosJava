package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double bites,i,suma;


        System.out.println("Cuantos bits quieres ?");

        bites = teclado.nextDouble();

        suma = Math.pow(2,bites);

        System.out.println("El resultado que representa esos bytes son " + suma );
    }
}
