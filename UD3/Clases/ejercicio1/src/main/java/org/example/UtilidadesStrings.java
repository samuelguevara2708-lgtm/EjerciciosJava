package org.example;

public class UtilidadesStrings {
    /**
     *
     * @param frase
     * @return
     */
    public static int  longitud(String frase){

        int resultado;

        if(frase == null)
            resultado = 0;

        else
            resultado = frase.length();

        return resultado;
    }

    public static int contar(String frase, char caracter){

        int resultado=0;

        if(frase == null)
            resultado = 0;

        else {
            frase = frase.toLowerCase();
            if (caracter >= 'A' && caracter <= 'Z') // Convertir un char en minuscula con tabla assci
                caracter+=32;
            for (int i=0; i< frase.length();i++){
                if (frase.charAt(i)==caracter)
                    resultado++;
            }

        }

        return resultado;
    }

    public static int vocales(String frase ){

        int resultado=0;


        if(frase == null)
            resultado = 0;

        else {
            frase = frase.toLowerCase();
            for (int i=0; i< frase.length();i++){
                if (frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' ||  frase.charAt(i)== 'o' || frase.charAt(i)== 'u'    )
                    resultado++;
            }

        }

        return resultado;
    }
}
