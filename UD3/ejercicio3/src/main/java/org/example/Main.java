package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Dame el numero");

        n = teclado.nextInt();

        System.out.println("Al revez es " + numero(n));

        if(n == numero(n)){
            System.out.println("El numero es capicua");

        }else System.out.println("No es capicua");

    }

    public static int numero(int n){

        int alrevez;

        int reversa;

        reversa = 0;

        while(n > 0){

            alrevez = n % 10;

            reversa = (reversa * 10) + alrevez ;

            n = n / 10;

        }

        return reversa;


    }
}
