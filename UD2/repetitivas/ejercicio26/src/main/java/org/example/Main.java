package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numeros,negativos;

        negativos = 0;

        //Pedir un numero
        System.out.println("Dame un numero");
        numeros = teclado.nextInt();

        while (numeros != 0){
            //Pedir un numero de nuevo
            System.out.println("dame otro numero");
            numeros = teclado.nextInt();

            if (numeros < 0){
                negativos++;
            }
        }

        System.out.println("El total de negativos es : " + negativos);


    }
}
