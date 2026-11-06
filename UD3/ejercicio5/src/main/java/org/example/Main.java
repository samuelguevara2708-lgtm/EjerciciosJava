package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner key = new Scanner(System.in);

        System.out.println("Dame la frase");

        String frase;

        frase = key.nextLine();

        frase = frase.toLowerCase();

        System.out.println( vocal(frase) );


    }

    public static String vocal(String y) {

        int longitude, x;

        longitude = y.length();

        char letra;

        String resultado;

        resultado = " ";

        int a = 0 , e = 0 , i = 0 , o = 0 , u = 0 ;

        boolean vocal = false;


        for (x = 0; x < longitude; x++) {
            letra = y.charAt(x);

            switch (letra) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }

        }

        resultado = "Letra a " + a + " letra e " + e + " letra i " + i + " letra o " + o + " letra u " + u;

        return resultado;
    }




}