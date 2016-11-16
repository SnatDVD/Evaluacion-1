
package com.iescomercio.tema4.numero;

public class Numero {
    
    private int valor;
    
    public void cambiarValor(int nuevoValor){
        valor = nuevoValor;
    }
    
    public boolean esPrimo(){
        int divisores = 0;
        int cont = 2;
        while (cont <= valor){
            if (valor%cont == 0){
                divisores++;
            }
            cont++;
        }
        return divisores == 1;
    }
    
    public boolean esPerfecto(){
        int cont = 1;
        int acum = 0;
        while(cont < valor){
            if (valor % cont == 0){
                acum = acum + cont;
            }
            cont++;
        }
        return acum == valor;
    }
    
}
