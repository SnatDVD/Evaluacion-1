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
public class RelojAlarma {

    private ClockDisplay reloj;
    private ClockDisplay alarma;

    public RelojAlarma(int horaReloj, int minReloj, int horaAlarma, int minAlarma) {
        alarma = new ClockDisplay(horaAlarma, minAlarma);
        reloj = new ClockDisplay(horaReloj, minReloj);
    }

    public RelojAlarma(int horaReloj, int minReloj) {
        alarma = new ClockDisplay();
        reloj = new ClockDisplay(horaReloj, minReloj);
    }

    public RelojAlarma() {
        reloj = new ClockDisplay();
        alarma = new ClockDisplay();
    }

    public String getHoraReloj() {
        return reloj.getTime();
    }

    public String getHoraAlarma() {
        return alarma.getTime();
    }

    
    public void setHoraReloj(int horaNueva,int minNuevo) {
        reloj.setTime(horaNueva, minNuevo);
    }

    public void setHoraAlarma(int horaNueva,int minNuevo) {
        alarma.setTime(horaNueva, minNuevo);
    }

    
    public void ticTac(){
        reloj.timeTick();
    }
    
    public void printHora() {
        reloj.printTime();
    }

}
