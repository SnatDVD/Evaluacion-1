
package com.iescomercio.tema4.numero;

public class Numero {
    
    private int valor;
    
    public Numero(int n){
        valor = n; 
    }
    
    public void setValor(int nuevoValor){
        valor = nuevoValor;
    }
    
    public int getValor(){
        return valor;
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
    
    public void listaPerfectos(){
        Numero indice = new Numero(4);
        System.out.println("Los numeros perfectos menores de " + this.valor + " son:");
        while (indice.valor < this.valor){
            if (indice.esPerfecto()){
                System.out.println(indice.valor);
            }
            indice.valor++;
        }
        System.out.println("==== Fin de la lista ====");
    }
    
    public void listaNumeros(){
        System.out.println("Los numeros hasta " + valor + " son:");
        for (int i = 1;i<=valor;i++){
            System.out.print(i);
        }
        System.out.println("==== Fin de la lista ====");
    }
    
    public int sumaCifras(){
        int acumulador = 0;
        int num = valor;
        while(num > 0){
            acumulador = acumulador + num%10;
            num = num/10;
        }
        return acumulador;
    }
    
    public int numDivisores(){
        int acum = 0;
        int cont = 1;
        while (cont <= valor){
            if (valor%cont == 0){
                acum++;
            }
            cont++;
        }
        return acum;
    }
    
    public String base2(){
        int num = valor;
        String numBin ="";
        while(num >= 2){
            if(num%2 == 0){
                numBin = 0 + numBin; 
            } else if (num%2 == 1){
                numBin = 1 + numBin;
            }
            num = num/2;
        }
        numBin = num + numBin;
        return numBin;
    }
    
}
