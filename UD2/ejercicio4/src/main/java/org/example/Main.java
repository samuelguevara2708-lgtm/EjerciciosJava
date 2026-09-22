package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n1,n2,n3,n4;


        System.out.println("Teclea el primer numero: ");

        n1 = teclado.nextInt();

        System.out.println("Teclea el segundo numero: ");

        n2 = teclado.nextInt();

        System.out.println("Teclea el tercer numero: ");

        n3 = teclado.nextInt();

        System.out.println("Teclea el cuarto numero: ");

        n4 = teclado.nextInt();

        if(n1 > n2 && n1 > n3 && n1 >n4)
            System.out.println("El numero " + n1 + " es el mayor");

        else if(n2 > n3 && n2 > n4)
            System.out.println("El numero " + n2 + " es el mayor");

        else if(n3 > n4)
            System.out.println("El numero " + n3 + " es el mayor");

        else System.out.println("El numero " + n4 + " es el mayor");






    }
}
