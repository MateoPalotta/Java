package consigna2;

public class CuentaBancaria {

		  private String titular;
		  private double saldo;
		  private int cantidadDepositos;
		  private int cantidadExtracciones;
		  
		  public CuentaBancaria(String titular, double saldo) {
		    this.titular = titular;
		    this.saldo = saldo;
		    this.cantidadDepositos = 0;
		    this.cantidadExtracciones = 0;
		  }
		  
		  public String getTitular() {
		    return this.titular;
		  }
		  
		  public double getSaldo() {
		    return this.saldo;
		  }
		  
		  public int getCantidadDepositos() {
		    return this.cantidadDepositos;
		  }
		  
		  public int getCantidadExtracciones() {
		    return this.cantidadExtracciones;
		  }
		  
		  public void setTitular(String titular) {
		    this.titular = titular;
		  }
		  
		  public void depositar(double cantidad) {
		    this.saldo += cantidad;
		    this.cantidadDepositos++;
		  }
		  
		  public boolean extraer(double cantidad) {
			    if (this.saldo >= cantidad) {
			      this.saldo -= cantidad;
			      this.cantidadExtracciones++;
			      return true;
			    } else {
			      return false;
			    }
			  }
		}
