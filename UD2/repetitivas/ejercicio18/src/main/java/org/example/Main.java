package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double n,n2,mayor,i,menor,resultado;

        int contador;

        contador = 0;
        mayor = 0;
        menor = 0;



        System.out.println("Dame un numero");

        n = teclado.nextInt();

        System.out.println("Dame otro numero");

        n2 = teclado.nextInt();

        if(n>n2){
            mayor = n;
        }


        else{
            mayor = n2;
        }

        if(n2< n){
            menor = n2;
        }

        else{
            menor = n;
        }



        for (i=menor;i <= mayor ; i++){
            if(i%2!=0){
                contador +=1;
                resultado = Math.pow(i,3);
                System.out.println(i + " ^ " + " 3 " + " = " + resultado );

            }

            if(contador==10){
                break; // no usar mucho
            }

        }
    }


}
