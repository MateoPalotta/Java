package Paquete3;

public class Guerrero {
	    private final String nombre;
	    private double vitalidad;
	    private double armadura;
	    private double x;
	    private double y;

	    public Guerrero(String nombre) {
	        this.nombre = nombre;
	        this.vitalidad = 500;
	        this.armadura = 800;
	        this.x = 0;
	        this.y = 0;
	    }

	    public Guerrero(String nombre, double x, double y) {
	        this(nombre);
	        this.x = x;
	        this.y = y;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getVitalidad() {
	        return vitalidad;
	    }

	    public void setVitalidad(double vitalidad) {
	        this.vitalidad = vitalidad;
	    }

	    public double getArmadura() {
	        return armadura;
	    }

	    public void setArmadura(double armadura) {
	        this.armadura = armadura;
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void mover(double inc_x, double inc_y) {
	        this.x += inc_x;
	        this.y += inc_y;
	    }

	    public void recibeDano(double cantidad) {
	        double danoRecibido = cantidad - armadura;
	        if (danoRecibido > 0) {
	            this.vitalidad -= danoRecibido;
	        }
	    }
}
