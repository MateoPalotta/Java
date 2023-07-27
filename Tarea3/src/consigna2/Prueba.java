package consigna2;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    CuentaBancaria cuenta = new CuentaBancaria("Mateo", 10000);
			    
			    System.out.println("Titular: " + cuenta.getTitular());
			    System.out.println("Saldo principal: " + cuenta.getSaldo());
			    
			    cuenta.depositar(500.0);
			    System.out.println("Saldo despues del depósito: " + cuenta.getSaldo());
			    System.out.println("Cantidad de depósitos: " + cuenta.getCantidadDepositos());
			    
			    boolean resultado = cuenta.extraer(700.0);
			    System.out.println("Saldo despues de la extracción: " + cuenta.getSaldo());
			    System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());
			    System.out.println("Resultado de la extracción: " + resultado);
			    
			    resultado = cuenta.extraer(2000.0);
			    System.out.println("Saldo despues de la extracción fallida: " + cuenta.getSaldo());
			    System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());
			    System.out.println("Resultado de la extracción fallida: " + resultado);
			  }
	}
