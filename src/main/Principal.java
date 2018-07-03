package main;
import algoritmos.Biseccion;
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
	public void saludar(String saludo) {
		System.out.println(saludo); 
	}
	public static void main(String[] args) throws InterruptedException{
		Principal p =new Principal();
		Datos datos=new Datos((double)1,(double)2,(double)1e-3) {
			@Override
			public double f(double x) {
				return (double)((Math.pow(Math.E, x))-4+x);
			}
			@Override
			public double f1(double x) {
				return (double)( Math.pow(Math.E, x)+1);
			} //derivada primera	
			@Override
			public double g(double x) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Biseccion biseccion= new Biseccion(datos);
		NewtonRaphson nR =new NewtonRaphson(datos, 1);
//		try {
//			biseccion.mostrarResultadoParaTest();
//		} catch (Exception e) {
//		}
		p.saludar(" biseccion comenzando");
		biseccion.mostrarResultadoParaTest1();
		p.saludar(" biseccion terminado");
		biseccion.mostrarResultadoParaTest2();
		p.saludar(" biseccion terminado");
		double x1 =datos.f1(1); 
		p.saludar(Double.toString(x1));
		nR.mostrarResultadoParaTest2();
		p.saludar("Hola");p.saludar("Hola");

		
	}
	
	
}
