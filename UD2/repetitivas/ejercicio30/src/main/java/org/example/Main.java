package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int hasta,i,contador;

        i= 2;

        contador = 1;

        System.out.println("Cuantos primos quieres ver");

        hasta = teclado.nextInt();



            while(contador < hasta) {
                if(ePrimo(i) <= 2){
                    System.out.println("El numero "+ i + " es primo " + "( " + contador +" )");
                    contador++;

                }

                i++;

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

