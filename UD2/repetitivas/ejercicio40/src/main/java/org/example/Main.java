package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,suma,contador,cero,total;

        double media;

        total = 0;

        cero = 0;

        contador = 0;

        media= 0;


        System.out.println("Dame un numero (0 para terminar)");

        n = teclado.nextInt();

        while(n !=0){


            suma = Math.abs(cero-n);

            contador++;

            total += suma;

            cero = n;

            System.out.println("Dame un numero (0 para terminar)");

            n = teclado.nextInt();





        }

        media = (double)total / contador;

        System.out.println("la media es " +  media);
    }
}
