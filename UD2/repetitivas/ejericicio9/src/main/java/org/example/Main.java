package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i;

        long factorial;

        factorial = 1;

        System.out.println("Dame un numero");

        n = teclado.nextInt();

        for(i=n;i >= 1; i--){
            factorial *= i;

        }

        System.out.println("El factorial de " + n + " es de un total de "+ factorial);

    }
}
