package Ejercicio1;

public class Motor {
	private String marcaMotor;
    private int numeroMotor;
    private int cilindrada;
    
    public Motor(String marcaMotor, int numeroMotor, int cilindrada) {
        this.marcaMotor = marcaMotor;
        this.numeroMotor = numeroMotor;
        this.cilindrada = cilindrada;
    }
    
    public String getMarcaMotor() {
        return marcaMotor;
    }
    
    public int getNumeroMotor() {
        return numeroMotor;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
}