package modelo;

public class Prueba {

	public static void main(String[] args) {
        CuentaCorriente cc=new CuentaCorriente("Matias", 1000);
        cc.depositar(500);
        System.out.println(cc);
        cc.extraer(200);
        System.out.println(cc);
        
        CajaDeAhorro cda=new CajaDeAhorro("Marcos", 1000);
        cda.depositar(500);
		System.out.println(cda);
        cda.extraer(200);
		System.out.println(cda);
  
        
		CuentaBancaria cu=new CuentaUniversitaria("Mateo");
		cu.depositar(500);
		System.out.println(cu);
		cu.extraer(200);
		System.out.println(cu);

	}

}



