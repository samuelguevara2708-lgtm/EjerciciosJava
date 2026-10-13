package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i;

        System.out.println("Dame un numero para ver sus divisores ");

        n = teclado.nextInt();

        for(i=n;i>=1;i--){
            if(n%i == 0){
                System.out.println(i + " es divisor");
            }
            else System.out.println(i + " no es divisor");
        }
    }
}
