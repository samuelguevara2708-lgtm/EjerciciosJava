package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double i,o,n,suma,n2;

        suma=0;

        n2=0;

        o=2;


        System.out.println("Dame N numeros para realizar en una division");

        n = teclado.nextInt();



        for (i=0; i <= n; i++){
            suma+= n2 / o;
            n2+=5;
            o *=3;

        }

        System.out.printf("El resultado da %f", suma);

    }
}
