package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i, numero;


        numero = 0;

        System.out.println("Dame un numero");

        n = teclado.nextInt();
        i = 1;

        while(i<=n && numero <= 2){
            if(n % i == 0){
                numero += 1;


            }

            i++;

        }

        if(numero <= 2){
            System.out.println("El numero es primo");
        }

        else{
            System.out.println("El numero no es primo");
        }

        System.out.println("La cantidad de  numeros que dividen a  es numero es  " + numero);



    }
}
