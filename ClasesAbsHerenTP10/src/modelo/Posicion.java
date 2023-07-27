package modelo;

public class Posicion {
	private double x;
    private double y;
    public double distancia;
    
    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void incrementarPos(double x, double y) {
        this.x += distancia;
        this.y += distancia;
    }

	public double distancia(Posicion posicion) {
		// TODO Auto-generated method stub
		return 0;
	}
}
