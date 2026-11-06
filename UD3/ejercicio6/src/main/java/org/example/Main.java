package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
    Scanner key = new Scanner(System.in);
        int a ;
        int b;
        System.out.println("Que mes");
        a = key.nextInt();

        System.out.println("Que año");
        b= key.nextInt();

        System.out.println("El mes " + a + " del año "+ b + " tiene " + mes(a,b) + " dias");


    }

    public static int mes(int a, int b){

        int dias;

        dias = 0;

        if (a == 2 && b % 4 == 0) {
            dias = 29;}

        if(a % 2 != 0 || a == 7){
            dias = 31;
        } else if (a % 2 == 0 && a != 2)dias = 30;

        return dias;



    }
}
