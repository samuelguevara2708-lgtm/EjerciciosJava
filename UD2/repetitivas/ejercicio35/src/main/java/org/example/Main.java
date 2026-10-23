package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int n;

        n = 1;

        do{
            n++;


        }while(n * (n+1) * (n + 2) != 800 * (n + (n+1) + (n+2)) );

        System.out.println(n + "-" + (n+1) + "-" + (n+2));


    }
}
