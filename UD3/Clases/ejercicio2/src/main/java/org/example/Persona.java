package org.example;

public class Persona {

    private String dni; //Propiedades
    private String nombre_completo;


    public Persona(String dni){
        if(!dnivalido(dni)){
            this.dni = null;
        }else {
            this.dni=dni;
            this.nombre_completo = "";
        }

    }

    public  Persona(String dni , String nombre_completo){
        if(!dnivalido(dni)){
            this.dni = null;
            this.nombre_completo = null;
        }else {
            this.dni=dni;
            this.nombre_completo = nombre_completo;
        }
    }

    public String getDni(){
        return this.dni;
    }

    public String getNombre_completo(){
        return this.nombre_completo;
    }

    public void setNombrecompleto(String nombre_completo){
        this.nombre_completo = nombre_completo;
    }

    public static char calcularletradni(int dni){
        int numero = dni % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE" ;

        return letras.charAt(numero);
    }

    public static boolean dnivalido(String dni){
        boolean valido = true;

        if(dni.length()!=9 ){
            valido = false;

        }else {
            String parte_Numerica = dni.substring(0,8);
            char letra = Character.toUpperCase(dni.charAt(8));

            if(!parte_Numerica.matches("^\\d{8}$")){
                valido = false;
            }else {
                int numero = Integer.parseInt(parte_Numerica);
                char letracalculada = calcularletradni(numero);
                if(letra != letracalculada){
                    valido = false;
                }
            }

        }


        return valido;
    }

}


