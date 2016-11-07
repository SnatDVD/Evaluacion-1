/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.relojConAlarma;

/**
 *
 * @author Vespertino
 */
public class mainRelojAlarma {
    public static void main(String[] args) {
        RelojAlarma a = new RelojAlarma(0, 16, 16, 49);
        a.printHora();
        System.out.println(a.getHoraReloj());
        System.out.println(a.getHoraAlarma());
    }
    
}
