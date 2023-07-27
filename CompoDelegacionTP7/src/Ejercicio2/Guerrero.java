package Ejercicio2;

public class Guerrero {
	  private String nombre;
	    private Posicion posicion;
	    private Arma arma;
	    private Armadura armadura;
	    private double nivelDanioPropio;
	    private double vitalidad;
	    
	    public Guerrero(String nombre, double x, double y, double nivelDanioPropio, double vitalidad) {
	        this.nombre = nombre;
	        this.posicion = new Posicion(x, y);
	        this.nivelDanioPropio = nivelDanioPropio;
	        this.vitalidad = vitalidad;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public double getX() {
	        return posicion.getX();
	    }
	    
	    public double getY() {
	        return posicion.getY();
	    }
	    
	    public void setX(double x) {
	        posicion.setX(x);
	    }
	    
	    public void setY(double y) {
	        posicion.setY(y);
	    }
	    
	    public void mueve(double incrementoX, double incrementoY) {
	        posicion.mueve(incrementoX, incrementoY);
	    }
	    
	    public double getNivelDanio() {
	        if (arma != null) {
	            return arma.getNivelDanio();
	        } else {
	            return nivelDanioPropio;
	        }
	    }
	    
	    public double getNivelDefensa() {
	        if (armadura != null) {
	            return armadura.getPorcentajeDefensa();
	        } else {
	            return 0.0;
	        }
	    }
	    
	    public double getVitalidad() {
	        return vitalidad;
	    }
	    
	    public void recibirDanio(double danio) {
	        if (armadura != null) {
	            double danioAbsorbido = danio * (1 - armadura.getPorcentajeDefensa() / 100.0);
	            vitalidad -= danioAbsorbido;
	        } else {
	            vitalidad -= danio;
	        }
	    }
	    
	    public void equiparArma(Arma arma) {
	        this.arma = arma;
	    }
	    
	    public void equiparArmadura(Armadura armadura) {
	        this.armadura = armadura;
	    }
	    
	    public void romperArma() {
	        if (arma != null) {
	            double nuevoPorcentajeRotura = arma.getPorcentajeRotura() - 10.0;
	            if (nuevoPorcentajeRotura < 0.0) {
	                nuevoPorcentajeRotura = 0.0;
	            }
	            arma.setPorcentajeRotura(nuevoPorcentajeRotura);
	        }
	    }
	    
	    public void reducirDefensaArmadura(double porcentajeReduccion) {
	        if (armadura != null) {
	            double nuevoPorcentajeDefensa = armadura.getPorcentajeDefensa() - porcentajeReduccion;
	            if (nuevoPorcentajeDefensa < 0.0) {
	                nuevoPorcentajeDefensa = 0.0;
	            }
	            armadura.setPorcentajeDefensa(nuevoPorcentajeDefensa);
	        }
	    }
}
