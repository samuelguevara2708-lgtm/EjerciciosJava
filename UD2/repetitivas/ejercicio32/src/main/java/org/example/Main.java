package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n;


        System.out.println("Dame un numero ");

        n = teclado.nextInt();

        System.out.println("El numero es en binario el "+ binario(n));



    }

    private static String binario(int n){

        int resto,nuevo;

        resto = 0;

        String binario;

        binario = "";


        while(n != 0){
            nuevo =  n / 2;
            resto = n % 2;
            n = nuevo;


            binario = binario + resto;
        }

        return binario;
    }
}
