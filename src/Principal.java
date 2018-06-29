import algoritmos.NewtonRaphson;
import algoritmos.PuntoFijo;
import calculo.Biseccion;
import datos.Datos;
import datos.Funciones_f;

public class Principal {

	public static void main(String[] args) {
		Datos datos=new Datos(0,1,1e-5) {
			@Override
			public double f(double x) {return 0;}
			@Override
			public double f1(double x) {return 0;}
			@Override
			public double f2(double x) {return 0;}
			@Override
			public double f3(double x) {return 0;}
			
		};
		Biseccion biseccion= new Biseccion(datos);
		NewtonRaphson newtonR = new NewtonRaphson(datos);
		PuntoFijo puntoFijo = new PuntoFijo(datos);
	}


}
