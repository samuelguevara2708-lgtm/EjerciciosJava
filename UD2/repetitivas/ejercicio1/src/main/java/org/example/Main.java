package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int suma = 0; //Sumador de los numeros de 1 a 100 (0 + i)

        for(int i = 1; i <= 100; i++){
            suma = suma + i;
        }

        System.out.println("La suma daria: "+ suma);


    }
}
