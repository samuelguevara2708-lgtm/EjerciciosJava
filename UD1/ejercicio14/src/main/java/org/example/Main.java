package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        final int SEGUNDOS = 186_455;

        System.out.println( SEGUNDOS + " segundos");

        int minutos = SEGUNDOS / 60;
        int segSr = SEGUNDOS % 60;

        System.out.println( minutos + " minutos " + segSr+ " segundos");

        int horas = minutos / 60;
        int minutosSr = minutos % 60;

        System.out.println(horas + " horas");

        int dias = horas / 24;

        int horasSr = horas % 24;

        System.out.println(dias + " dias " + horasSr + " horas " + minutosSr + " minutos " + segSr + " segundos " );

    }
}
