package com.iescomercio.tema3.elInstituto;

import com.iescomercio.tools.AleatorioInt;

public class Profesor {

    public void ponerNotas(Alumno alum) {
        AleatorioInt randNum = new AleatorioInt(0, 10);
        if (alum.getAsig1() != null) {
            alum.getAsig1().setCalificacion(randNum.dameAleatorioEntero());
        }
        if (alum.getAsig2() != null) {
            alum.getAsig2().setCalificacion(randNum.dameAleatorioEntero());
        }
        if (alum.getAsig3() != null) {
            alum.getAsig3().setCalificacion(randNum.dameAleatorioEntero());
        }
    }

    public double hacerMedia(Alumno alum) {

        double media;
        int sumatorio = 0;
        int numAsig = 0;

        if (alum.getAsig1() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsig1().getCalificacion();
        }
        if (alum.getAsig2() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsig2().getCalificacion();
        }
        if (alum.getAsig3() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsig3().getCalificacion();
        }
        if (numAsig == 0) {
            System.out.println("El alumno no tiene ninguna asignatura");
            return 0;
        }
        media = (double) sumatorio / numAsig;
        return media;
    }

}
