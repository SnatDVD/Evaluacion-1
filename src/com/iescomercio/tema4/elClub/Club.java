package com.iescomercio.tema4.elClub;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {

    private ArrayList<Socio> socios;

    public Club() {
        socios = new ArrayList<Socio>();
    }

    public void asociar(Socio miembro) {
        socios.add(miembro);
    }

    public int numeroSocios() {
        int cont = 0;
        int tam = socios.size();
        while (cont < tam) {
            cont++;
        }
        return cont;
    }

    public void listarMiembrosIt() {
        Iterator<Socio> it = socios.iterator();
        System.out.println("=====================");
        System.out.println("=  LISTA DE SOCIOS  =");
        System.out.println("=====================\n");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("================================");
    }

    public void listarMiembrosFor() {
        System.out.println("=====================");
        System.out.println("=  LISTA DE SOCIOS  =");
        System.out.println("=====================\n");
        for (Socio s : socios) {
            System.out.println(s.toString());
        }
        System.out.println("================================");
    }

    public ArrayList<Socio> purgar(int mesAPurgar) {
        ArrayList<Socio> listaAPurgar = new ArrayList<Socio>();
        Iterator<Socio> it = socios.iterator();
        Socio aux;

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getMes() == mesAPurgar) {
                listaAPurgar.add(aux);
                it.remove();
            }
        }
        return listaAPurgar;
    }

    public void añadirMujeresForEach() {
        Socio socioAux;
        ArrayList<Socio> listaAux = new ArrayList<Socio>();
        for (Socio s : socios) {
            if (!s.getNombre().contains("Mujer de ")) {
                socioAux = new Socio("Mujer de " + s.getNombre(), s.getMes(), s.getAño());
                listaAux.add(socioAux);
            }
        }
        socios.addAll(listaAux);
    }

    public void añadirMujeresWhile() {
        Socio sAux, sAux2;
        int tam = socios.size();
        int cont = 0;
        while (cont < tam) {
            sAux = socios.get(cont);
            if (!sAux.getNombre().contains("Mujer de ")) {
                sAux2 = new Socio("Mujer de " + sAux.getNombre(), sAux.getMes(), sAux.getAño());
                asociar(sAux2);
            }
            cont++;
        }
    }

    public void sociosMesForEach(int mes) {
        for (Socio s : socios) {
            if (s.getMes() == mes) {
                System.out.println(s.toString());
            }
        }
    }

    public void sociosMesIt(int mes) {
        if (mes > 0 && mes < 13) {
            Iterator<Socio> it = socios.iterator();
            Socio aux;
            while (it.hasNext()) {
                aux = it.next();
                if (aux.getMes() == mes) {
                    System.out.println(aux.toString());
                }
            }
        } else {
            System.out.println("Debe introducir un numero entre 1 y 12");
        }
    }

    public void sociosMesWhile(int mes) {
        int cont = 0, tam = socios.size();
        Socio aux;
        while (cont < tam) {
            aux = socios.get(cont);
            if (aux.getMes() == mes) {
                System.out.println(aux.toString());
            }
            cont++;
        }
    }

    public boolean estaSocio(String nombre) {
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void cambiarMes() {
        for (Socio s : socios) {
            if (s.getMes() < 12) {
                s.setMes(s.getMes() + 1);
            } else {
                s.setMes(1);
            }
        }
    }

    public void listarSociosMes() {
        int contMes = 1, contSoc;
        System.out.println("==========================");
        System.out.println("=  Nº DE SOCIOS POR MES  =");
        System.out.println("==========================\n");
        while (contMes < 13) {
            contSoc = 0;
            for (Socio s : socios) {
                if (s.getMes() == contMes) {
                    contSoc++;
                }
            }
            if (contSoc > 0) {
                System.out.println("Mes " + contMes + " -> " + contSoc);
            }
            contMes++;
        }
        System.out.println("==========================");
    }

    public void mesConMasSocios() {
        int contMes = 1, contSoc, maxMes = 0, maxSocios = 0;
        while (contMes < 13) {
            contSoc = 0;
            for (Socio s : socios) {
                if (s.getMes() == contMes) {
                    contSoc++;
                }
            }
            if (contSoc > maxSocios) {
                maxMes = contMes;
                maxSocios = contSoc;
            }
            contMes++;
        }
        System.out.println("El mes con más ingresos ha sido el " + maxMes);
        System.out.println("Han ingresado " + maxSocios + " socios");
    }

    public void listarSociosTrimestre() {
        int contTrimestre = 0, contSoc;
        while (contTrimestre < 5) {
            contSoc = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contTrimestre) {
                    contSoc++;
                }
            }
            if (contSoc > 0) {
                System.out.println("El trimestre " + contTrimestre
                        + " tiene " + contSoc + " socios");
            }
            contTrimestre++;
        }
    }
    
    private int dameSociosTrimestre(int t){
        int contSoc = 0;
        for(Socio s:socios){
            if (s.trimestre() == t){
                contSoc++;
            }
        }
        return contSoc;
    }

    public void trimestreMasSocios() {
        int contTrimestre = 1, contSoc, maxTri = 0, maxSoc = 0;
        while (contTrimestre < 5) {
            contSoc = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contTrimestre) {
                    contSoc++;
                }
            }
            if (contSoc > maxSoc) {
                maxTri = contTrimestre;
                maxSoc = contSoc;
            }
            contTrimestre++;
        }
        System.out.println("El trimestre con mas ingresos es el " + maxTri);
        System.out.println("Ha tenido " + maxSoc + " socios");
    }

    public void trimestreMenosSocios() {
        int contTrimestre = 1, contSoc, minTri = 0, minSoc = 0;
        while (contTrimestre < 5) {
            contSoc = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contTrimestre) {
                    contSoc++;
                }
            }
            if (contTrimestre == 1) {
                minTri = contTrimestre;
                minSoc = contSoc;
            } else if (contSoc < minSoc) {
                minTri = contTrimestre;
                minSoc = contSoc;
            }
            contTrimestre++;
        }
        System.out.println("El trimestre con menos ingresos es el " + minTri);
        System.out.println("Ha tenido " + minSoc + " socios");
    }

    public String nombreMasLargoPrimero() {
        String maxNombre = "", nombre;
        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() > maxNombre.length()) {
                maxNombre = nombre;
            }
        }
        return maxNombre;
    }

    public String nombreMasLargoUltimo() {
        String maxNombre = "", nombre;
        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() >= maxNombre.length()) {
                maxNombre = nombre;
            }
        }
        return maxNombre;
    }

    public ArrayList<String> nombreMasLargoTodos() {
        ArrayList<String> aux = new ArrayList<String>();
        String maxNombre = "", nombre;
        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() > maxNombre.length()) {
                maxNombre = nombre;
                aux.clear();
                aux.add(maxNombre);
            } else if (nombre.length() == maxNombre.length()) {
                aux.add(nombre);
            }
        }
        return aux;
    }

    public String nombreMasCortoPrimero() {
        String minNombre = "", nombre;
        if (!socios.isEmpty()) {
            minNombre = socios.get(0).getNombre();
            for (Socio s : socios) {
                nombre = s.getNombre();
                if (nombre.length() < minNombre.length()) {
                    minNombre = nombre;
                }
            }
        }
        return minNombre;
    }

    public String nombreMasCortoUltimo() {
        String minNombre = "", nombre;
        if (!socios.isEmpty()) {
            minNombre = socios.get(0).getNombre();
            for (Socio s : socios) {
                nombre = s.getNombre();
                if (nombre.length() <= minNombre.length()) {
                    minNombre = nombre;
                }
            }
        }
        return minNombre;
    }

    public ArrayList<String> nombreMasCortoTodos() {
        String minNombre = "", nombre;
        ArrayList<String> aux = new ArrayList<String>();
        if (!socios.isEmpty()) {
            minNombre = socios.get(0).getNombre();
            for (Socio s : socios) {
                nombre = s.getNombre();
                if (nombre.length() < minNombre.length()) {
                    minNombre = nombre;
                    aux.clear();
                    aux.add(minNombre);
                } else if (nombre.length() == minNombre.length()) {
                    aux.add(nombre);
                }
            }
        }
        return aux;
    }

    public void dosMesesMasSocios() {
        int primerMes = 0, segundoMes = 0, primerSocios = 0, segundoSocios = 0;
        int contMes = 1, contSocios;
        while (contMes < 13) {
            contSocios = 0;
            for (Socio s : socios) {
                if (s.getMes() == contMes) {
                    contSocios++;
                }
            }
            if (contSocios > primerSocios) {
                segundoSocios = primerSocios;
                segundoMes = primerMes;
                primerSocios = contSocios;
                primerMes = contMes;
            } else if (contSocios > segundoSocios) {
                segundoSocios = contSocios;
                segundoMes = contMes;
            }
            contMes++;
        }
        System.out.println("El primer mes es el " + primerMes + " con " + primerSocios + " socios");
        System.out.println("El segundo mes es el " + segundoMes + " con " + segundoSocios + " socios");
    }

    public float mediaMeses() {
        int acum = 0, cont = 0;
        for (Socio s : socios) {
            acum = acum + s.mesesEnClub();
            cont++;
        }
        return (float) acum / cont;
    }

    public Socio primerIngreso() {
        Socio aux = socios.get(0);
        for (Socio s : socios) {
            if (s.esAnterior(aux)) {
                aux = s;
            }
        }
        return aux;
    }

    public Socio ultimoIngreso() {
        Socio aux = socios.get(0);
        for (Socio s : socios) {
            if (aux.esAnterior(s)) {
                aux = s;
            }
        }
        return aux;
    }
}
