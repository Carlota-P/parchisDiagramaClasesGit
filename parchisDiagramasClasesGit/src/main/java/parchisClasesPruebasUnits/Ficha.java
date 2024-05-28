package parchisClasesPruebasUnits;

public class Ficha {
	
	// Atributos
	private String color;
	private int casilla;
	private Jugador jugador;
	
	public Ficha() {
        this.casilla = 0;
    }
 
	// Métodos
	public void mover (int salto)
	{
        this.casilla += salto;	
    }
	
	public int getPosicion() 
	{
        return casilla;
    }
	

}
