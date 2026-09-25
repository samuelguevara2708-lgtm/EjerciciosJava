package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int horas,minutos;

        System.out.println("Dame la hora en formarto 24 con espacio: ");
        horas = teclado.nextInt();
        minutos = teclado.nextInt();

        if(horas >= 12){
            horas -= 12;// horas = horas - 12;
            System.out.printf("La hora es: %02d:%02d PM\n ", horas, minutos);

        }

        else System.out.printf("La hora es:  %02d:%02d AM\n ", horas, minutos);


    }
}
