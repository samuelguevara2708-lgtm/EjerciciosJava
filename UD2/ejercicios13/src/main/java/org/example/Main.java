package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double kilometros,tarifa_plana,tarifa_2,tarifa_3;

        tarifa_plana = 30;

        System.out.println("Cuantos kilometros hiciste ? ");

        kilometros = teclado.nextDouble();

        if(kilometros > 30){

           if(kilometros >= 300 && kilometros <= 1000){
               tarifa_2 = tarifa_plana + (kilometros * 0.2);
               System.out.printf("La factura quedaria en unos %.0f euros", tarifa_2);

           } else if (kilometros >=1000) {
               tarifa_3= tarifa_plana + ( 700 * 0.20) + ((kilometros - 1000)* 0.15) ;
               System.out.printf("La factura quedaria en unos %.0f euros", tarifa_3);

           } else
               System.out.printf("La factura quedaria en unos %.0f euros", tarifa_plana);

           }

        }



    }

