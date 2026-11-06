package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i,operacion,total,f1,f2;

        f1 = 0;
        f2 =1;

        System.out.println("Dame numero");

        n = teclado.nextInt();

        for(i=1;i<=n;i++){

            System.out.printf(f1 + " ");

            operacion = f1 + f2 ;

            f1 = f2;

            f2 = operacion;


        }



    }
}
