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
    
    public int trimestre(){
        if (mes < 4){
            return 1;
        } else if (mes < 7){
            return 2;
        } else if (mes < 10){
            return 3;
        } else {
            return 4;
        }
    }

    public String toString()
    {
        return "Nombre: " + getNombre() +
               " se unió el mes " +
               getNombreMes() + " de " + getAño();
    }
    
    public int mesesEnClub(){
        return (2016 - año)*12 + 12 - mes;
    }
    
    public boolean esAnterior(Socio soc){
        int auxMeses1, auxMeses2;
        auxMeses1 = this.getAño()*12 + this.getMes();
        auxMeses2 = soc.getAño()*12 + soc.getMes();
        return auxMeses1 < auxMeses2;
    }
    
    public String getNombreMes(){
        switch (mes){
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default: return "Mes no valido";
        }
    }
}
