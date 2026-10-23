package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int n;

        n = 1;

        int suma = 0;


        do{
            suma += ++n;

        }while (suma <= 10000);


        System.out.println(n);
    }

}
