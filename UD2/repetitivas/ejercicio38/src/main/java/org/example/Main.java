package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,n1, temporal;

        n1 = 0;

        temporal = 0;

        do{
            System.out.println("Dame un numero de manera ascendente");

            n = teclado.nextInt();

            temporal = n1;

            n1 = n;


        }while (n > temporal);
    }
}
