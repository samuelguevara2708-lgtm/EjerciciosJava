package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero_veces;

        System.out.println("Cuantos numeros quieres introducir (0 para parar)");

        numero_veces = teclado.nextInt();

        double media = 0;


        while( numero_veces > 0 ) {
            for (int i = 0; i < numero_veces; i++) {
                System.out.println("Dame un numero");
                media += teclado.nextInt(); // esto es i1 + i2 + i3 + i4
            }


            media /= (double) numero_veces;
            System.out.println("La media es " + media);
            break;

        }




    }
}