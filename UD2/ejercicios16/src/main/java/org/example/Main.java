package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        double a,b,c,d,e,f,h,i,g;

        double  dia, mes , ano,dia_semana;



        System.out.println("Dame la data de tu cumpleaños en este formato dia/mes/año");

        dia = teclado.nextDouble();
        mes = teclado.nextDouble();
        ano = teclado.nextDouble();

        while (dia<1|| dia> 31){
            System.out.println("Error dia incorrecto");
            dia = teclado.nextDouble();

        }

        a = (12 - mes) / 10; // División enteira
        b = ano - a;
        c = mes + (12 * a);
        d = b / 100;
        e = d / 4;
        f = 2 - d + e;
        g = Math.floor(365.25 * b);
        h = Math.floor(30.6001 * (c + 1));
        i = f + g + h + dia + 5;
        dia_semana = i % 7;

        int dia_entero = (int) dia_semana; // Convierto la variable a entera para el swicht



        switch (dia_entero){
            case 0 -> System.out.println("Sabado");
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miercoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
        }


    }
}
