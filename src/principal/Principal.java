package principal;
import algoritmos.Biseccion;
import algoritmos.NewtonRaphson;
import algoritmos.PuntoFijo;
import datos.Datos;
public class Principal {
	public static void ejemplo() {
		Datos ejemplo=new Datos(1,2,(double)1e-4) {
			@Override
			public double f(double x) {//f(x)
				return (double)((Math.pow(Math.E, x))+x-4);
			}
			@Override
			public double f1(double x) {
				return Math.pow(Math.E, x)+1; //derivada primera de f(x)			
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
	public static void main(String[] args) {
		Datos ejemplo=new Datos(20,21,(double)1e-5) {
			@Override
			public double f(double x) {//f(x)
				return (double)((Math.pow(2, x)+25600*x-1571840));
			}
			@Override
			public double f1(double x) {
				return Math.pow(2, x)*Math.log(2)+25600; //derivada primera de f(x)			
			}
			@Override
			public double g(double x) {
				return 8+(1/Math.log(2))*(Math.log(6140-100*x));
			}
		};

		Biseccion biseccion= new Biseccion(ejemplo);
		NewtonRaphson newtonR = new NewtonRaphson(ejemplo,20.5);
		PuntoFijo puntoFijo = new PuntoFijo(ejemplo,20.5);
		biseccion.mostrarTabla_criterio2();
		newtonR.mostrarTabla_criterio2();
		puntoFijo.mostrarTabla_criterio2();	
	}
}
