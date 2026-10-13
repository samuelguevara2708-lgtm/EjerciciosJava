package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i,i2;

        i2=1;

        System.out.println("Dame un numero");

        n = teclado.nextInt();

        for(i=0; i < n; i++ ){
            System.out.print(i2 + " ");
            i2*= -2;

        }

    }


}
