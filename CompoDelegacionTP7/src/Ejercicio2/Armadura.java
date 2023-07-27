package Ejercicio2;

public class Armadura {
	   private String nombre;
	    private double porcentajeDefensa;
	    
	    public Armadura(String nombre, double porcentajeDefensa) {
	        this.nombre = nombre;
	        this.porcentajeDefensa = porcentajeDefensa;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public double getPorcentajeDefensa() {
	        return porcentajeDefensa;
	    }
	    
	    public void setPorcentajeDefensa(double porcentajeDefensa) {
	        this.porcentajeDefensa = porcentajeDefensa;
	    }
}
