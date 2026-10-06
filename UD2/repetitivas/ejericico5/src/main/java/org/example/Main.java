package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double i,numero,division;

        division = 0;

        System.out.println("Cuantos numeros quieres dividir por 1? ");

        numero = teclado.nextDouble();


        for(i=1; i <= numero;i++ ){
            division += 1 / i;

        }

        System.out.println("La division de " + numero + " " + "da un total de " + division);


    }
}
