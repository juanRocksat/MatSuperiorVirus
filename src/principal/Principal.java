package principal;
import algoritmos.Biseccion;
import algoritmos.NewtonRaphson;
import algoritmos.PuntoFijo;
import datos.Datos;

public class Principal {
	public static void main(String[] args) {
		Datos ejemplo=new Datos(1,2,(double)1e-4) {
			@Override
			public double f(double x) {
				return (double)((Math.pow(Math.E, x))+x-4);
			}
			@Override
			public double f1(double x) {
				return Math.pow(Math.E, x)+1; //derivada primera de f+
				
			}
			@Override
			public double g(double x) {
				return Math.log(4-x);//g(x)=ln(4-x)
			}
		};
		Biseccion biseccion= new Biseccion(ejemplo);
		NewtonRaphson newtonR = new NewtonRaphson(ejemplo,1);
		PuntoFijo puntoFijo = new PuntoFijo(ejemplo,1);
		biseccion.mostrarTabla_criterio2();
		newtonR.mostrarTabla_criterio2();
		puntoFijo.mostrarTabla_criterio2();
		
	}
	public void saludar(String saludo) {
		System.out.println(saludo); 
	}
	
	
	
}
