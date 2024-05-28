
/**
 * 
 */
package parchisClasesPruebasUnits;

import java.util.Random;

public class Dado {

	// ATRIBUTO
	private int numero;
	 
	// MÉTODO
    public void tirar() 
    {
        Random aleatorio = new Random();
        numero = aleatorio.nextInt(6) + 1;
    }
 
    public int mostrarTirada() {
        return numero;
    }
	
}
