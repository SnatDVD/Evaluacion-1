
package com.iescomercio.tema4.notebook;

public class Main {

    public static void main(String[] xddddddd) {
        
        Notebook agenda = new Notebook();
        
        agenda.storeNote("Hola");
        agenda.storeNote("Gato");
        agenda.storeNote("Chiqui");
        agenda.storeNote("Xdddddd");
        
        agenda.deleteNote(2);
        
        agenda.printNotes();
        
    }
}
