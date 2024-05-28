/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al juego de PARCHIS!");
        System.out.println("----------------------------------");
		
		Tablero tablero = new Tablero();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Usuario persona1 = new Usuario("Juan", "persona1", 2005, tablero);
        Usuario persona2 = new Usuario("Pepe", "persona2", 2005, tablero);
 
        Usuario[] jugadores = {persona1, persona2};
        int turno = 0;
 
        do {
            Usuario jugadorActual = jugadores[turno % 2];
            System.out.println("----------------------------------");
            System.out.println("Turno de " + jugadorActual.getNombreUsuario());
            System.out.println("----------------------------------");
            System.out.println(jugadorActual.getNombreUsuario() + " tira los dados.");
 
            jugadorActual.tirarDado(dado1);
            jugadorActual.tirarDado(dado2);
 
            int tirada = jugadorActual.consultarDado(dado1) + jugadorActual.consultarDado(dado2);
            System.out.println("Ha salido el " + tirada);
 
            int numFicha = turno % 2; 
            jugadorActual.moverFicha(numFicha, tirada);
 
            System.out.println("La ficha " + numFicha + " de " + jugadorActual.getNombreUsuario() + " esta en la casilla " + jugadorActual.consultarTablero(numFicha));
 
            turno++;
        } while (persona1.consultarTablero(0) < tablero.consultarNumCasillas() && persona1.consultarTablero(1) < tablero.consultarNumCasillas() &&
                 persona2.consultarTablero(0) < tablero.consultarNumCasillas() && persona2.consultarTablero(1) < tablero.consultarNumCasillas());
 
        System.out.println("Fin del juego");
    }

}
