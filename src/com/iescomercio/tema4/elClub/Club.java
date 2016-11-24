package com.iescomercio.tema4.elClub;

import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
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
        while (cont < tam){
            cont++;
        }
        return cont;
    }
    
    public void listarMiembros() {
        Iterator<Socio> it = socios.iterator();
        System.out.println("=====================");
        System.out.println("=  LISTA DE SOCIOS  =");
        System.out.println("=====================\n");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("================================");
    }
    
    public ArrayList<Socio> purgar(int mesAPurgar){
        ArrayList<Socio> listaAPurgar = new ArrayList<Socio>();
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getMes() == mesAPurgar){
                listaAPurgar.add(aux);
                it.remove();
            }
        }
        return listaAPurgar;
    }
    
    public void añadirMujeres(){
        Socio socioAux;
        ArrayList<Socio> listaAux = new ArrayList<Socio>();
        for (Socio s:socios){
            if (!s.getNombre().contains("Mujer de ")){
            socioAux = new Socio("Mujer de " + s.getNombre(), s.getMes(), s.getAño());
            listaAux.add(socioAux);
            }
        }
        socios.addAll(listaAux);
    }
    
    public void añadirMujeres2(){
        Socio sAux,sAux2;
        int tam = socios.size();
        int cont = 0;
        while (cont < tam){
            sAux = socios.get(cont);
            if (!sAux.getNombre().contains("Mujer de ")){
                sAux2 = new Socio("Mujer de " + sAux.getNombre(),sAux.getMes(),sAux.getAño());
                asociar(sAux2);
            }
            cont++;
        }
    }
    
    public void sociosMes(int mes){
        for (Socio s:socios){
            if (s.getMes() == mes){
                System.out.println(s.toString());
            }
        }
    }
    
    public void sociosMes2(int mes){
        if(mes>0 && mes<13){
            Iterator<Socio> it = socios.iterator();
            Socio aux;
            while (it.hasNext()){
                aux = it.next();
                if(aux.getMes() == mes){
                    System.out.println(aux.toString());
                }
            }
        } else {
            System.out.println("Debe introducir un numero entre 1 y 12");
        }
    }
    
    public boolean estaSocio(String nombre){
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        while (it.hasNext()){
            aux = it.next();
            if (aux.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    
    public void cambiarMes(){
        for (Socio s:socios){
            if (s.getMes()<12){
                s.setMes(s.getMes() + 1);
            } else {
                s.setMes(1);
            }
        }
    }
    
    
    
}
