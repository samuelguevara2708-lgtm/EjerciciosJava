package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,valor1,resultado, valor2, valor3;

        resultado = 0;


        do {
            System.out.println("****************");
            System.out.println("Aritmetrica Yahoo");
            System.out.println("******************");
            System.out.println("1,Operacion siguiente");
            System.out.println("2.Operacion sumar");
            System.out.println("3.Salir");
            System.out.println("Elige un valor");



            n = teclado.nextInt();

            if(n == 1){
                System.out.println("Introduce un numero  (-1 para descoñecido, 5 para moitos)");

                valor1 = teclado.nextInt();

                if(valor1 <=-1){
                    System.out.println("valor desconocido");
                } else if (valor1 >= 4 ) {
                    System.out.println("Muchos");
                } else  {

                    valor1++;

                    System.out.println("siguiente " + valor1);

                }

            }

            if(n == 2){
                System.out.println("Introduce un numero  (-1 para descoñecido, 5 para moitos)");

                valor2 = teclado.nextInt();

                System.out.println("Introduce un numero  (-1 para descoñecido, 5 para moitos)");

                valor3 = teclado.nextInt();

                resultado = valor2 + valor3;

                if(resultado > 4){
                    System.out.println("Resultado muchos");
                } else if (valor2 <= -1 || valor3 <= -1) {
                    System.out.println("Valor desconocido");
                } else  {
                    System.out.println("Resultado " + resultado );
                }

            }

            }while (n != 3);





    }
}
