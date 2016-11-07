
package com.iescomercio.tools;

public class AleatorioInt {
    private final int nInicial, nFinal;

    public AleatorioInt(int pInicial, int pFinal) {
        nInicial = pInicial;
        nFinal = pFinal;
    }
    
    public void muestraAleatoriosEntero(int pCantidad) {
        int cantidad;
        for (cantidad = pCantidad; cantidad > 0; cantidad--) {
            dameAleatorioEntero();
        }
    }
    public int dameAleatorioEntero () {
        int numero;
        numero = (int) (Math.random() * (nFinal - nInicial + 1) + nInicial);
        return numero;
    }
}
