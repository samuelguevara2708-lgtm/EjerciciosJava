package org.example;

public class Banco {

    private String titular;
    private double importe;



    public Banco(String titular , double importe){
        if(!(titular == null)) {
            this.titular = titular;
            this.importe = importe;
        }else {
            this.titular = null;
            this.importe = 0;
        }

    }


    public void setTitular(String titular){
        this.titular = titular;
    }


    public void setImporte(double importe){
        this.importe = importe;
    }

    public  String getTitular(){
        return this.titular ;
    }

    public  Double getimporte(){
        return this.importe ;
    }

    public void  ingresar(double importe){
        if(!(importe > 0)){
            importe = 0;
        }

        this.importe += importe;
    }

    public void retirar(double importe){
        if(this.importe - importe < 0){
            this.importe = 0;
        }else {
            this.importe -= importe;
        }
    }

    @Override
    public String toString(){
        return "O titular " + this.titular + " tiene " + this.importe + " en la cuenta ";
    }

}
