package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        String frase;

        System.out.println("Dame la frase");

        frase = teclado.nextLine();

        frase = frase.toLowerCase();

        System.out.println(vocal(frase) +  consonantes(frase) + numero(frase)+ simbolos(frase));


    }


    public static String vocal(String y) {

        int longitude, x;

        longitude = y.length();

        char letra;

        String resultado;

        resultado = "";


        for (x = 0; x < longitude; x++) {
            letra = y.charAt(x);
            if (letra == 'a' | letra == 'b' | letra == 'i' | letra == 'o' | letra == 'u') {

                resultado += letra + " es una vocal\n ";


            }
        }

        return resultado;

    }

    public static String numero(String y) {

        int longitude, x;

        longitude = y.length();

        char letra;

        String resultado;

        resultado = "";


        for (x = 0; x < longitude; x++) {
            letra = y.charAt(x);
            if (letra > 48 && letra < 57) {

                resultado += letra + " es un numero\n ";


            }


        }



        return resultado;

    }

    public static String consonantes(String y) {

        int longitude, x;

        longitude = y.length();

        char letra;

        String resultado;

        resultado = "";

        boolean numero = false;

        boolean vocal = false;

        boolean simbolo = false;

        boolean consonante = false;


        for (x = 0; x < longitude; x++) {
            letra = y.charAt(x);
            if (letra > 48 && letra < 57) {

                numero = true;
            } else if (letra == 'a' | letra == 'b' | letra == 'i' | letra == 'o' | letra == 'u') {

                vocal = true;
            }

            else if(!numero || !vocal||letra >= 'a' && letra <= 'z'){
                resultado += letra +  " es un consonante\n";

            }

            }



        return resultado;

    }

    public static String simbolos(String y) {

        int longitude, x;

        longitude = y.length();

        char letra;

        String resultado;

        resultado = "";

        boolean numero = false;

        boolean vocal = false;

        boolean consonante = false;


        for (x = 0; x < longitude; x++) {
            letra = y.charAt(x);
            if (letra > 48 && letra < 57) {

                numero = true;
            }  else if (letra == 'a' | letra == 'b' | letra == 'i' | letra == 'o' | letra == 'u') {

                vocal = true;


            } else if(letra >= 'a' && letra <= 'z'){
                consonante = true;

            } else if (!numero|| !vocal|| !consonante ||letra > 0 && letra <255 ) {
                resultado += letra + " es un caracter\n" ;
            }

        }



        return resultado;

    }


}





