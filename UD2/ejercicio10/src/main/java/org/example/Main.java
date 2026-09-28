package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double a,b,c,d,e,f,ano;

        String mes = "";

        System.out.println("Dame el año : ");
        ano = teclado.nextDouble();

        a = ano % 19;
        b = ano % 4;
        c = ano % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        f=  (22 + d + e);

        if(f<=31){
            mes = "Marzo";

        }

        else f-=31;
        mes = "Abril";
        System.out.printf("Semana santa sera el %.0f del mes de Abril" , f);



    }
}
