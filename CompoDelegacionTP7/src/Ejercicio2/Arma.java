package Ejercicio2;

public class Arma {
    private String nombre;
    private double nivelDanioInicial;
    private double porcentajeRotura;
    
    public Arma(String nombre, double nivelDanioInicial, double porcentajeRotura) {
        this.nombre = nombre;
        this.nivelDanioInicial = nivelDanioInicial;
        this.porcentajeRotura = porcentajeRotura;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getNivelDanio() {
        return nivelDanioInicial * (porcentajeRotura / 100.0);
    }
    
    public double getPorcentajeRotura() {
        return porcentajeRotura;
    }
    
    public void setPorcentajeRotura(double porcentajeRotura) {
        this.porcentajeRotura = porcentajeRotura;
    }
}
