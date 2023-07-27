package modelo;

public class Guerrero {
	
	private String nombre;
	private int vitalidad;
	private int armadura;
	private double x;
	private double y;
	
	
	public Guerrero(String nombre, int vitalidad, int armadura, double x, double y) {
		super();
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.armadura = armadura;
		this.x = x;
		this.y = y;
	}
	public Guerrero (String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getVitalidad() {
		return vitalidad;
	}
	
	public int getArmadura() {
		return armadura;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Guerrero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", x=" + x
				+ ", y=" + y + "]";
	}
	
	public void mueve(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void recibeDano(int cantidad) {
		if(this.armadura>=cantidad)
			this.armadura-=cantidad;
		else {
			int aux=cantidad-this.armadura;
			this.armadura=0;
			this.vitalidad-=aux;
		}
	
	}
	
	
	
	
	
}
