package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        {
        int n;


        do {


            n = menu();


            while (n< 0 || n > 4){
                System.out.println("Error , vuelva a intentarlo");
                n = teclado.nextInt();
            }

            switch (n){
                case 1 -> {
                    System.out.println("Cuadrado");
                }
                case 2 -> System.out.println("Rectangulo");
                case 3 -> System.out.println("Triangulo");
                case 4 -> System.out.println("Ciruclo");
                case 0 -> System.out.println("Saliendo del menu");
            }

            System.out.println("*********************");

        }while (n!=0);




        }
    }

    public static int menu(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Del 1-5 elige la opcion (0 para finalizar)");
        System.out.println("******************************************");
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectagulo");
        System.out.println("3.Triangulo");
        System.out.println("4.Circulo");
        System.out.println("0.Salir");

        int n1 = teclado.nextInt();

        return n1;
    }
}
