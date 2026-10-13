package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numero, numero2,mayor,menor,numero_veces,total;

        numero_veces = 0;
        total=0;

        double media;



        System.out.println("Dame una serie de numeros (0) para acabar.");
        numero = teclado.nextInt();

        mayor = numero;
        menor = numero;


        while (numero != 0) {

            numero_veces++;

            total += numero;

            if(numero > mayor){
                mayor = numero;
            }

            else if(numero < menor){
                menor = numero;
            }
            System.out.println("Dame una serie de numeros (0) para acabar.");
            numero = teclado.nextInt();


        }

        media = (double)total / (double)numero_veces;
        System.out.println("Media " + media);
        System.out.println("Mayor " + mayor);
        System.out.println("Menor " +  menor);


    }
}