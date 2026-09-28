package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Teclea el numero del mes 1-12: ");

        int mes = teclado.nextInt();

        String mes_nombre="";

        switch (mes){
            case 1:
                mes_nombre= "Enero";
                break;
            case 2:
                mes_nombre="Febrero";
                break;
            case 3:
                mes_nombre="Marzo";
                break;
            case 4:
                mes_nombre="Abril";
                break;
            case 5:
                mes_nombre="Mayo";
                break;
            case 6:
                mes_nombre="Junio";
                break;

            case 7:
                mes_nombre="Julio";
                break;

            default:
                System.out.println("Error ese mes no existe");


        }

        switch (mes){
            case 1 ,3,5,7,8,10,12 -> System.out.println(mes_nombre+ " Tiene 31 dias ");
            case 2 -> System.out.println(mes_nombre + " Tiene 28 dias");
            default -> System.out.println(mes_nombre + " Tiene 31 dias");
        }




    }
}
