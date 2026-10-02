package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final int N = 5;

        double media = 0;

        for(int i = 0; i < N; i++){
            System.out.println("Dame un numero");
            media+= teclado.nextInt(); // esto es i1 + i2 + i3 + i4
        }

        media /= (double)N;
        System.out.println("La media es " + media);

    }
}
