package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double unidades, precio,descuento,precio_f;

        System.out.println("Cuantos unidades de articulos compras? ");

        unidades= teclado.nextDouble();

        precio= 4.5;


        if(unidades >= 100){
            descuento = precio - precio * 0.4;
            precio_f = unidades * descuento;
            System.out.println("Tendras un descuento del 40% y queda : " + precio_f);}

        else if (unidades >= 25){
            descuento = precio - precio * 0.2;
            precio_f = unidades * descuento;
            System.out.println("Tendras un descuento del 20% y queda : " + precio_f);}

        else if(unidades >= 10 && unidades <= 24){
            descuento = precio - precio * 0.1;
            precio_f = unidades * descuento;
            System.out.println("Tendras un descuento del 10% y queda : " + precio_f);}

        else
            System.out.println("No hay descuento");


    }
}

