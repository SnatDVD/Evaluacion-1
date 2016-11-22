
package com.iescomercio.tema4.elClub;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("chiqui", 1, 1998);
        Socio socio2 = new Socio("david", 1, 1978);
        Socio socio3 = new Socio("superman", 8, 1203);
        Socio socio4 = new Socio("trump", 9, 1998);
        Socio socio5 = new Socio("pepito", 5, 1996);
        Socio socio6 = new Socio("pac-man", 2, 1045);
        
        Club daw = new Club();
        
        daw.asociar(socio1);
        daw.asociar(socio2);
        daw.asociar(socio3);
        daw.asociar(socio4);
        daw.asociar(socio5);
        daw.asociar(socio6);
        
        //daw.purgar(1);
        
        //daw.listarMiembros();
        
        
        
    }
}
    
