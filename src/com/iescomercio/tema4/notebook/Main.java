
package com.iescomercio.tema4.notebook;

public class Main {

    public static void main(String[] xddddddd) {
        
        Notebook agenda = new Notebook();
            
        agenda.storeNote("Hola");
        agenda.storeNote("Gato");
        agenda.storeNote("cine 4");
        agenda.storeNote("cine 3");
        agenda.storeNote("cine");
        
        //agenda.deleteNote(2);
        
        //agenda.imprimirNotas2();
        
        //agenda.buscar("Ga");
        
        //
        
        agenda.borrarNotasIterator("cine");
        
        agenda.imprimirNotasIterator();
    }
}
