package com.iescomercio.tema4.notebook;

import java.util.ArrayList;

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
        if (noteNumber < 0) {
        } else if (noteNumber < numberOfNotes()) {
            System.out.println(notes.get(noteNumber));
        } else {
        }
    }
    
    public void deleteNote(int noteNumber) {
        if (noteNumber < 0){
            System.out.println("No se admiten números negativos");
        } else if (noteNumber < numberOfNotes()){
            notes.remove(noteNumber);
        } else {
            System.out.println("El número introducido es demasiado grande");
        }
        
    }
}
