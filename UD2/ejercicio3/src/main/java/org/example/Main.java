package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Dame un numero q no sea 0: ");
        numero = teclado.nextInt();

        if(numero!=0){

            if(numero % 2 == 0)
                System.out.println("El numero es par");

            else
                System.out.println("El numero es impar");
        }

        else
            System.out.println("El numero no puede ser 0");






    }
}


