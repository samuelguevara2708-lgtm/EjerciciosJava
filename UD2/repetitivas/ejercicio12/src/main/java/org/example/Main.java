package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n,i,n2;

        n2=0;

        System.out.println("Dame un numero");
        n = teclado.nextInt();


        while (n > 10){
            System.out.println("No puede ser mas de 9");
            n= teclado.nextInt();

        }

        System.out.println("Tabla del numero " + n);

        for(i=0;i <=10 ;i++){
            n2 = i * n;
            System.out.println(n + " X " + i + " = " + n2);


        }


    }
}
