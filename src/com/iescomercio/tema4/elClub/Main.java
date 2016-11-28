
package com.iescomercio.tema4.elClub;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("aaaaaaaaa", 1, 2001);
        Socio socio2 = new Socio("bbbbbbbb", 2, 534);
        Socio socio3 = new Socio("cccc", 5, 1896);
        Socio socio4 = new Socio("dddddddddd", 12, 1003);
        Socio socio5 = new Socio("ee", 3, 534);
        Socio socio6 = new Socio("ffff", 6, 2001);
        
        Club daw = new Club();
        
        daw.asociar(socio1);
        daw.asociar(socio2);
        daw.asociar(socio3);
        daw.asociar(socio4);
        daw.asociar(socio5);
        daw.asociar(socio6);
        
        //daw.añadirMujeresWhile();
        //daw.añadirMujeres2ForEach();
        
        //daw.purgar(1);
        
        //daw.listarMiembrosIt();
        
        //daw.sociosMesIt(1);
        //daw.sociosMesForEach(1);
        //daw.sociosMesWhile(1);
        
        //System.out.println(daw.estaSocio("davi"));
        
        //daw.listarSociosMes();
        
        //daw.mesConMasSocios();
        
        //daw.listarSociosTrimestre();
        
        //daw.trimestreMasSocios();
        
        //daw.trimestreMenosSocios();
        
        //System.out.println(daw.nombreMasLargoPrimero());
        
        //System.out.println(daw.nombreMasLargoUltimo());
        
        //System.out.println(daw.nombreMasLargoTodos());
        
        //System.out.println(daw.nombreMasCortoPrimero());
        
        //System.out.println(daw.nombreMasCortoUltimo());
        
        //System.out.println(daw.nombreMasCortoTodos());
             
        //daw.dosMesesMasSocios();
        
        //System.out.println(daw.mediaMeses());
        
        //System.out.println(daw.primerIngreso());
        
        System.out.println(daw.ultimoIngreso());
    }
}
    
