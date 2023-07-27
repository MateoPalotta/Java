package paquete;

public class Prueba {
	
	 public static void main(String[] args) {
	        Motor motor = new Motor("L13A_i-DSI", 1.6, "Gasolina");
	        Chasis chasis = new Chasis("LK_123", 1200);
	        Automovil automovil = new Automovil("Honda", 2012, motor, chasis, 5000000);

	        System.out.println(automovil);
	        System.out.println("Tipo de combustible: " + automovil.getTipoCombustible());
	        System.out.println("Cilindrada: " + automovil.getCilindrada());

	        automovil.setPrecio(4350000);
	        System.out.println("Nuevo precio: " + automovil.getPrecio());
	    }
}
