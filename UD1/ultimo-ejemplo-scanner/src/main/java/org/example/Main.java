package org.example;

//Pide 2 operandos y opera con ellos

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double operando1, operando2, resultado;

        System.out.println("dame valor 1: " );
        operando1 = teclado.nextDouble();

        System.out.println("dame valor 2: " );
        operando2 = teclado.nextDouble();

        resultado= operando1 + operando2;

        System.out.printf("\nLa suma de %.2f y %.2f nos da: %.2f " , operando1, operando2 , resultado );

        resultado= operando1 * operando2;

        System.out.printf("\n El producto de %.2f y %.2f nos da: %.2f" , operando1, operando2, resultado);


        //Division

        if(operando2!=0) {
            resultado = operando1 / operando2;
            System.out.println("\nLa division de los dos da: " + resultado);
        }
        else {
            System.out.println("\nNo se puede dividir por 0");

        }
    }
}
