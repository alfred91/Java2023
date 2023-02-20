package ejercicio8;

public class Arma {
	
	    private String nombre;
	    private int puntos;
	    private int disparos;
	    
	    public Arma(String nombre, int puntos, int disparos) {
	        this.nombre = nombre;
	        this.puntos = puntos;
	        this.disparos = disparos;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public int getPuntos() {
	        return puntos;
	    }
	    
	    public void setPuntos(int puntos) {
	        this.puntos = puntos;
	    }
	    
	    public int getDisparos() {
	        return disparos;
	    }
	    
	    public void setDisparos(int disparos) {
	        this.disparos = disparos;
	    }
	    
	    @Override
	    public String toString() {
	        return nombre + " (daño: " + puntos + ", balas: " + disparos + ")";
	    }
	}