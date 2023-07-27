package Paquete2;

public class CuentaBancaria {
	 private final String titular;
	    private double saldo;
	    private int cantidadDepositos;
	    private int cantidadExtracciones;

	    public CuentaBancaria(String titular) {
	        this.titular = titular;
	        this.saldo = 0.0;
	        this.cantidadDepositos = 0;
	        this.cantidadExtracciones = 0;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public int getCantidadDepositos() {
	        return cantidadDepositos;
	    }

	    public int getCantidadExtracciones() {
	        return cantidadExtracciones;
	    }

	    public void depositar(double cantidad) {
	        if (cantidad > 0) {
	            saldo += cantidad;
	            cantidadDepositos++;
	        }
	    }

	    public boolean extraer(double cantidad) {
	        if (cantidad > 0 && saldo >= cantidad) {
	            saldo -= cantidad;
	            cantidadExtracciones++;
	            return true;
	        }
	        return false;
	    }

	    @Override
		public String toString() {
			return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos="
					+ cantidadDepositos + ", cantidadExtracciones=" + cantidadExtracciones + "]";
		}
}
