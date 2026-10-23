package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,suma;

       suma = 0;

        do {
            System.out.println("Dame un numero (0 para terminar)");

            n = teclado.nextInt();

            if(n > 0)
                suma += n;


        }while (n != 0);

        System.out.println("La suma de positivos es " + suma);


    }
}
