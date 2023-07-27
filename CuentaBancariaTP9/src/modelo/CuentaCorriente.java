package modelo;

public class CuentaCorriente extends CuentaBancaria {
	private double tope;

    public CuentaCorriente(String titular, double tope) {
        super(titular);
        this.tope = tope;
    }
    @Override
    public boolean extraer(double cantidad) {
    	boolean respuesta = false;
        if (cantidad <= saldo + tope) {
            saldo -= cantidad;
            respuesta = true;
        }
       return respuesta;
    }
     
}