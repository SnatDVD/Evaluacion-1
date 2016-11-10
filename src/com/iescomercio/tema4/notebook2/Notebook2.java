package com.iescomercio.tema4.notebook2;

import java.util.ArrayList;

public class Notebook2 {

    private ArrayList<String> notes;

    public Notebook2() {
        notes = new ArrayList<String>();
    }

    public void storeNote(String note) {
        notes.add(note);
    }

    public int numberOfNotes() {
        return notes.size();
    }

    public void removeNote(int noteNumber) {
        if (noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        } else if (noteNumber < numberOfNotes()) {
            // This is a valid note number.
            notes.remove(noteNumber);
        } else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * List all notes in the notebook.
     */
    public void listNotes() {
        for (String note : notes) {
            System.out.println(note);
        }
    }
}
