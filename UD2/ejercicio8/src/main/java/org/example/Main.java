package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int a,b,c,d;

        System.out.println("Escribe un numero entero de 4 digitos ");

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        System.out.println("El numero es:" + a + b+ c+ d);

        if(c >= 5){
            if(b==9) {
                a++;
                b=0;
                System.out.println("El numero redondeado es " + a + b + "00");
            }
            else b++;
            System.out.println("El numero redondeado es " + a + b + "00");



        }

        else
            System.out.println("El numero redondeado es " + a + b + "00");

        System.out.println("Millares " + a);
        System.out.println("Centenas " + b);
        System.out.println("Decenas " + c);
        System.out.println("Unidades "+ d);


    }


}
