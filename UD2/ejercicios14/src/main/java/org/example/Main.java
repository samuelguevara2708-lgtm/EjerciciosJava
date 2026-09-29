package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double serie;

        System.out.println("Dame el numero de serie del producto");

        serie = teclado.nextDouble();


        if(serie>= 14681 && serie <= 15681){

            System.out.println("Producto defectuoso numero de serie " + serie);

        } else if (serie >= 70001 && serie <= 79999) {
            System.out.println("Producto defectuoso numero de serie " + serie);

        } else if (serie >= 88888 && serie <= 111111) {
            System.out.println("Producto defectuoso numero de serie " + serie);

        }
        else System.out.println("Producto de serie " + serie + " no defectuoso");


    }



}
