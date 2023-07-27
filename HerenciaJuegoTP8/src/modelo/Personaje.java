package modelo;

public class Personaje{
    private String nombre;
    private int vitalidad;
    protected Posicion posicion;

    public Personaje(String nombre, int vitalidad, Posicion posicion) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public double getPosicionX() {
        return posicion.getPosX();
    }

    public double getPosicionY() {
        return posicion.getPosY();
    }

    public void setPosicion(double posX, double posY) {
        posicion.setXY(posX, posY);
    }

    public void incrementarPosicion(double valorX, double valorY) {
        posicion.incrementaPos(valorX, valorY);
    }

    public double calcularDistancia(Personaje otroPersonaje) {
        return posicion.distancia(otroPersonaje.getPosicion());
    }

	private Posicion getPosicion() {
		// TODO Auto-generated method stub
		return null;
	}

	public void recibeDanio(int danioAtaqueCerca) {
		// TODO Auto-generated method stub
		
	}

	public boolean ataca(Personaje adversario) {
		// TODO Auto-generated method stub
		return false;
	}

}
