package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double c,r,k;

        int f,f2;

        System.out.println("Teclea el valor desde ");

        f = teclado.nextInt();

        System.out.println("Teclea el valor hasta ");

        f2 = teclado.nextInt();

        while(f > f2) {
            System.out.println("Error");

            System.out.println("Teclea el valor desde ");

            f = teclado.nextInt();

            System.out.println("Teclea el valor hasta ");

            f2 = teclado.nextInt();

        }


        for (f = f; f <= f2; f++) {
                c = 5 * (f - 32) / 9;
                r = f + 459.67;
                k = c + 273.15;

                System.out.println(f + " grados farhrenit equivalen a \n " + c + "\n" + r + "\n" + k);
        }

    }
}
