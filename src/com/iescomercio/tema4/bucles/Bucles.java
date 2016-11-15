package com.iescomercio.tema4.bucles;

public class Bucles {

    public void ejercicio1(int num) {
        int aux = 0;
        if (num < 0) {
            while (num < aux) {
                aux--;
                System.out.println(aux);
            }
        } else if (num >= 0) {
            while (num > aux) {
                aux++;
                System.out.println(aux);
            }
        }
    }

    public void ejercicio2(int desde, int hasta) {
        int aux;
        if (hasta < desde) {
            aux = hasta;
            hasta = desde;
            desde = aux;
        }
        if (desde%5 != 0){
            desde = desde + (5-(desde%5)); 
        }
        if (hasta%5 != 0){
            hasta = hasta - (desde%5);
        }
        aux = desde;
        while (aux <= hasta) {
            System.out.println(aux);
            aux = aux + 5;
        }
    }

    public void ejercicio3(int desde, int hasta) {
        int aux;
        if (hasta < desde) {
            aux = hasta;
            hasta = desde;
            desde = aux;
        }
        if (desde%7 != 0){
            desde = desde + (7-(desde%7)); 
        }
        if (hasta%7 != 0){
            hasta = hasta - (desde%7);
        }
        aux = desde;
        while (aux <= hasta){
            System.out.println(aux);
            aux = aux + 7;
        }
    }
    
    public void ejercicio4(int min, int max, int cantidad){
        int aux;
        if (max < min) {
            aux = max;
            max = min;
            min = aux;
        }
        aux = 0;
        while (aux < cantidad){
            System.out.println((int)(Math.random() * (max - min + 1) + min));
            aux++;
        }
    }

}
