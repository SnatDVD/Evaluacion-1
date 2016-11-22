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
    
}
