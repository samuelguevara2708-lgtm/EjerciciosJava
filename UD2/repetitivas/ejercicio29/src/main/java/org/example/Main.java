package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int desde,hasta,i,temporal;

        System.out.println("Dame el numero desde ");

        desde = teclado.nextInt();

        System.out.println("Dame el numero hasta");

        hasta = teclado.nextInt();



        if(desde > hasta){
            temporal = desde;

            desde = hasta;

            hasta = temporal;

        }



        for(i=desde;i <= hasta; i++) {
            if(ePrimo(i) <= 2){
                System.out.println("El numero "+ i + " es primo");

        }
            else {
                System.out.println("El numero " + i  + " no es primo");
            }







    }



}

        public static int ePrimo(int n){
            int i,numero;

            numero = 0;
            i=1;


            while(i<=n && numero <= 2){
                if(n % i == 0){
                    numero += 1;


                }

                i++;

            }

            return numero;

        }
}

