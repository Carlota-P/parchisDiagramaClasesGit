package parchisClasesPruebasUnits;

public class Usuario extends Jugador
{
	 private String nombreUsuario;
	    private int fechaNacimiento;
	 
	    public Usuario(String nombre, String nombreUsuario, int fechaNacimiento, Tablero tablero) 
	    {
	        super(nombre, tablero);
	        this.nombreUsuario = nombreUsuario;
	        this.fechaNacimiento= fechaNacimiento; 
	    }
	 
	    public String getNombreUsuario() {
	        return nombreUsuario;
	    }
	 
	    public void setNombreUsuario(String nombreUsuario) {
	        this.nombreUsuario = nombreUsuario;
	    }

	    public int getFechaNacimiento()
	    {
	    	return fechaNacimiento;
	    }
	    
	    public void setFechaNacimiento(int fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }
		

}



