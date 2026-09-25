package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double salario_f,salario_b;

        int hijos;

        salario_b = 2500;

        System.out.println("Cuantos hijos tienes? ");

        hijos = teclado.nextInt();

        if(hijos>0){
            if(hijos <= 2){
                salario_f = salario_b - salario_b * 0.2;
                System.out.printf("El salario bruto tras retencion seria %.2f" , salario_f);
                System.out.println("\nEl numero de hijos es " + hijos);
            }

            else if(hijos>=3 && hijos <=5){
                salario_f = salario_b - salario_b * 0.15;
                System.out.printf("El salario bruto tras retencion seria %.2f" , salario_f);
                System.out.println("\nEl numero de hijos es " + hijos);
            }

            else if(hijos>=6 && hijos <=7){
                salario_f = salario_b - salario_b * 0.1;
                System.out.printf("El salario bruto tras retencion seria %.2f" , salario_f);
                System.out.println("\nEl numero de hijos es " + hijos);
            }

            else if(hijos>=8 && hijos<=9){
                salario_f = salario_b - salario_b * 0.05;
                System.out.printf("El salario bruto tras retencion seria %.2f" , salario_f);
                System.out.println("\nEl numero de hijos es " + hijos);
            }

            else
                System.out.println("No aplica retencion");
        }

        else
            System.out.println("No puede ser un numero negativo");






    }
}
