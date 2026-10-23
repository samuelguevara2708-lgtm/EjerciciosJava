package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String opcion;

        int n, n1,temporal,n2;

        n1 = 0;

        temporal = 0;

        n2 = 100;


        do {
            System.out.println("dame una (A) o una (D) en caso ascendente o contrario (S) para salir");

            opcion = teclado.nextLine();

            if(opcion.equalsIgnoreCase("A")){
                do{
                    System.out.println("Dame un numero de manera ascendente");

                    n = teclado.nextInt();

                    temporal = n1;

                    n1 = n;


                }while (n > temporal);
            }


            if(opcion.equalsIgnoreCase("D")){
                do{
                    System.out.println("Dame un numero de manera descendente");


                    n = teclado.nextInt();

                    temporal = n2;

                    n2 = n;


                }while ( n2 < temporal);
            }

        }while (!opcion.equals("S"));
    }
}
