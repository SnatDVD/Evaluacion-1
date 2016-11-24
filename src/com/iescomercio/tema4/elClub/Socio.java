package com.iescomercio.tema4.elClub;


public class Socio
{
    private String nombre;
    private int mes;
    private int año;

    public Socio(String nombre, int mes, int año)
        throws IllegalArgumentException
    {
        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException(
                "Mes " + mes + " esta fuera de rango. Debe estar entre 1 y 12 ");
        }
        this.nombre = nombre;
        this.mes = mes;
        this.año = año;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getMes()
    {
        return mes;
    }

    public int getAño()
    {
        return año;
    }
    
    public void setMes(int mes){
        if(mes<13 && mes>0){
            this.mes = mes;
        } else {
            System.out.println("Debe introducir un numero entre 1 y 12");
        }
    }

    public String toString()
    {
        return "Nombre: " + nombre +
               " se unió el mes " +
               mes + " de " + año;
    }
}
