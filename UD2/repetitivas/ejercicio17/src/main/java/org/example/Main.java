package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int i;

        double r;

        for(i=1; i <= 20; i++){
            if(i % 2 == 0){
                r = Math.pow(i,2);
                System.out.println("El cuadrado de " + i + " es " + r);

            }

        }
    }
}
