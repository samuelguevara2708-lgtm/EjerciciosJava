package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int n,digito;

        System.out.println("Dame el numero en binario");

        n = teclado.nextInt();

        digito = n % 10 ;

        while(digito > 1){


            System.out.println("Error dame otro numero");

            n = teclado.nextInt();

            digito = n % 10 ;


        }

        System.out.println("el numero en decimal es " + menu(n));



    }

    public static  int menu(int n){

        int digito,resultado,posicion;

        resultado = 0;

        posicion = 0;

        while(n>0){

            digito = n % 10 ;
            resultado = resultado + digito * Math.powExact(2,posicion);

            n = n / 10;

            posicion++;
        }

        return resultado;
    }

}
