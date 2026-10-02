package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n1,n2,suma;

        suma = 0;

        System.out.println("Dame un numero: ");

        n1 = teclado.nextInt();


        System.out.println("Dame un numero: ");

        n2 = teclado.nextInt();

        for(int i = n1; i <= n2; i++ ){
            if(i % 2 == 0){
              suma+= i;
            }

        }

        System.out.println("La suma de "+ n1 +" " +  n2 +" de pares da " + suma);


    }
}
