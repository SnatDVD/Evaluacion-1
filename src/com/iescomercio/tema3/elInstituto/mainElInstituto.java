package com.iescomercio.tema3.elInstituto;

public class mainElInstituto {

    public static void main(String[] args) {

        Asignatura a1 = new Asignatura(100);
        Asignatura a2 = new Asignatura(101);
        Asignatura a3 = new Asignatura(102);

        Alumno alumn = new Alumno(123456, "Pepito Grillo");

        alumn.setAsig1(a1);
        alumn.setAsig2(a2);
        alumn.setAsig3(a3);

        Profesor prof = new Profesor();

        prof.ponerNotas(alumn);

        System.out.println("Asignatura 1: " + alumn.getAsig1().getCalificacion());
        System.out.println("Asignatura 2: " + alumn.getAsig2().getCalificacion());
        System.out.println("Asignatura 3: " + alumn.getAsig3().getCalificacion());
        System.out.println("Media: " + (int) prof.hacerMedia(alumn));
    }
}
