package paquete2;

public class Jugador {
	private String nombre;
    private int edad;
    private String posicion;
    private double efectividad;

    public Jugador(String nombre, int edad, String posicion, double efectividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.efectividad = efectividad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getEfectividad() {
        return efectividad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEfectividad(double efectividad) {
        this.efectividad = efectividad;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", efectividad=" + efectividad + "]";
    }
}
