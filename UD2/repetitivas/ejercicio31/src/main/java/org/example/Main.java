package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner telcado = new Scanner(System.in);

        int importe;

        importe = 0;


        System.out.println("Indique el importe");

        importe = telcado.nextInt();

        while (importe > 0)
            if(importe >= 200){
                importe = importe % 200;

                } else if (importe >= 100) {

                importe += importe % 100;

                } else if( importe >= 50){

                importe += importe % 50;


                } else if (importe >= 20) {

                importe += importe % 20;

                } else if (importe >= 10) {

                importe += importe % 10;

                } else if (importe >= 5) {

                importe += importe % 5;

                } else if (importe >= 2) {

                importe += importe % 2;

                } else if (importe >= 1) {
                 importe += importe % 1;

            }

        System.out.println(importe);

    }
}
