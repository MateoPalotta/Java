package modelo;

public class Empleado extends Persona{
	
	private int sueldo;

	public Empleado(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.sueldo=2500;
	}
	
    public void mostrar() {
        System.out.println("Sueldo: " + sueldo);
    }
}
