package com.iescomercio.tema3.elInstituto;

public class Asignatura {

    private int id;
    private int calificacion;

    public Asignatura(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
