package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int variable=50;

        variable*=8; // Es una forma corta de escribir: variable = variable * 8;

        System.out.println(variable); //400

        byte variableByte; //-112

        variableByte=(byte)variable; //cambiamos la variable "variable" de int a byte

        System.out.println(variableByte);

    }
}
