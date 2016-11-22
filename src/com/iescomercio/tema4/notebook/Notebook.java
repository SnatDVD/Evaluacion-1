package com.iescomercio.tema4.notebook;

import java.util.ArrayList;
import java.util.Iterator;

public class Notebook {

    private ArrayList<String> notes;

    public Notebook() {
        notes = new ArrayList<String>();
    }

    public void storeNote(String note) {
        notes.add(note);
    }

    public int numberOfNotes() {
        return notes.size();
    }

    public void showNote(int noteNumber) {
        int indice = noteNumber - 1;
        if (indice < 0) {
            System.out.println("No se admiten números negativos");
        } else if (indice < numberOfNotes()) {
            System.out.println(notes.get(indice));
        } else {
            System.out.println("El numero introducido es demasiado grande");
        }
    }
    
    public void deleteNote(int noteNumber) {
        int indice = noteNumber - 1;
        if (indice < 0){
            System.out.println("No se admiten números negativos");
        } else if (indice < numberOfNotes()){
            notes.remove(indice);
        } else {
            System.out.println("El número introducido es demasiado grande");
        }
    }
    
    public void printNotes(){
        for(String note:notes){
            System.out.println(note);
        }
    }
    
    public void imprimirNotas(){
        int contador = 0;
        int cantidad = numberOfNotes();
        do {
            showNote(contador);
            contador++;
        } while (contador < cantidad);
    }
    
    public void imprimirNotas2(){
        int contador = 0;
        int cantidad = numberOfNotes();
        while (contador < cantidad){
            System.out.print(contador + 1 +": ");
            showNote(contador);
            contador++;
        }
    }
    
    public void imprimirNotasIterator(){
        int cont = 1;
        String s = "";
        Iterator<String> it = notes.iterator();
        System.out.println("Las notas de la agenda son: ");
        while (it.hasNext()){
            s = it.next();
            System.out.println(cont + " - " + s);
            cont++;
        }
    }
    
    
    public void buscar(String chiqui){
        int indice = 0;
        boolean encontrado = false;
        int tamano = notes.size();
        while (indice < tamano && !encontrado){
            String nota = notes.get(indice);
            if (nota.contains(chiqui)){
                encontrado = true;
            } else {
                indice ++;
            }
        }
        if (encontrado) {
            System.out.println("Se ha encontrado la cadena en la posicion " + indice);
        } else {
            System.out.println("No se ha encontrado la cadena");
        }
    }
    
    public void borrarNotasIterator (String chiqui){
        String s;
        Iterator<String> it = notes.iterator();
        while(it.hasNext()){
            s = it.next();
            if (s.contains(chiqui)){
                it.remove();
            }
        }
    }
    
}
