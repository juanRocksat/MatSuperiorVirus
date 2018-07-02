package main;
import algoritmos.Biseccion_v2;
import algoritmos.NewtonRaphson;
import algoritmos.PuntoFijo;
import datos.Datos;

public class Principal {
//	public static void main(String[] args) {
//		Datos datos=new Datos(0,1,(double)1e-5) {
//			@Override
//			public double f(double x) {
//				return (2*(Math.pow(2, x))+512*100*x+2048)/1024;
//			}
//			@Override
//			public double f1(double x) {return 0;}
//			@Override
//			public double f2(double x) {return 0;}
//			@Override
//			public double f3(double x) {return 0;}
//		};
//		Biseccion biseccion= new Biseccion(datos);
//		NewtonRaphson newtonR = new NewtonRaphson(datos);
//		PuntoFijo puntoFijo = new PuntoFijo(datos);
//	}
	private void saludar(String saludo) {
		System.out.println(saludo); 
	}
	public static void main(String[] args) {
		Principal p =new Principal();
		Datos datos=new Datos((double)1,(double)2,(double)1e-2) {
			@Override
			public double f(double x) {
				return (double)((Math.pow(Math.E, x))-4+x);
			}
			@Override
			public double f1(double x) {return 0;}
			@Override
			public double f2(double x) {return 0;}
			@Override
			public double f3(double x) {return 0;}
			@Override
			public double f4(double x) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public double g(double x) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Biseccion_v2 biseccion= new Biseccion_v2(datos);
		biseccion.mostrarResultadoParaTest();
		p.saludar("Hola");p.saludar("Hola");
		p.saludar("Hola");p.saludar("Hola");
		double x1 =datos.f(1); 
		p.saludar(Double.toString(x1));
	}
}
