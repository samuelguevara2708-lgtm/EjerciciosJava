package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double m=1, n=2, p=3, q=4, a=5, b=6, x=7, y=8;

        System.out.println("1- " + (m/n)*(p+q));
        System.out.println("2- " + (m/n+1));
        System.out.println("3- " + (m+1)/n);
        System.out.println("4- " +  (m+n/1));

        //double resultado= (x+y)*(x+y)*(a-b); --> Una forma de hacerlo

        double resultado;
        resultado = Math.pow(x+y,2)*(a-b);
        System.out.println("5- " + resultado );

    }
}
