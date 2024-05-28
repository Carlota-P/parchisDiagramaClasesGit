package parchisClasesPruebasUnits;

public class Ficha {
	
	//ATRIBUTOS
	private String color; 
	private int posicion;
	private Jugador jugador; 
 
	// CONSTRUCTOR 
	public Ficha() {
        this.posicion = 0;
    }
 
	// MÉTODOS
	public void mover (int pasos)
	{
        this.posicion += pasos;	
    }
	
	public int getPosicion() 
	{
        return posicion;
    }
	

}
