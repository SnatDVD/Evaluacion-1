package com.iescomercio.tema3.elInstituto;

public class Alumno {

    private int numExpediente;
    private String nombre;
    private Asignatura asig1;
    private Asignatura asig2;
    private Asignatura asig3;

    public Alumno(int numExpediente) {
        this.numExpediente = numExpediente;
        nombre = "";
        asig1 = null;
        asig2 = null;
        asig3 = null;
    }

    public Alumno(int numExpediente, String nombre) {
        this.numExpediente = numExpediente;
        this.nombre = nombre;
        asig1 = null;
        asig2 = null;
        asig3 = null;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignatura getAsig1() {
        return asig1;
    }

    public Asignatura getAsig2() {
        return asig2;
    }

    public Asignatura getAsig3() {
        return asig3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsig1(Asignatura asig1) {
        this.asig1 = asig1;
    }

    public void setAsig2(Asignatura asig2) {
        this.asig2 = asig2;
    }

    public void setAsig3(Asignatura asig3) {
        this.asig3 = asig3;
    }
}
