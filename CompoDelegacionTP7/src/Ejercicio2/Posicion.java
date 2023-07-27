package Ejercicio2;

public class Posicion {
	private double x;
    private double y;
    
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
    
    public void mueve(double incrementoX, double incrementoY) {
        this.x += incrementoX;
        this.y += incrementoY;
    }
}
