package paquete;

public class Automovil {
    private String marca;
    private int modelo;
    private Motor motor;
    private Chasis chasis;
    private double precio;

    public Automovil(String marca, int modelo, Motor motor, Chasis chasis, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.chasis = chasis;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return motor.getTipoCombustible();
    }

    public double getCilindrada() {
        return this.motor.getCilindrada();
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis + ", precio=" + precio + "]";
    }
}