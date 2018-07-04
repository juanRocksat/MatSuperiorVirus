package algoritmos;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import datos.Datos;
import principal.Principal;

public class NewtonRaphson extends Algoritmo{
	public double x0;
	public NewtonRaphson(Datos datos_ ,double x0_ ) {
		this.datos=datos_;
		this.x0=x0_;
		this.cotaDeError=datos_.getCotaDeError();
	}
	@Override
	public	void preparar() {
		this.n=1;
		this.xn=this.x0;
		this.f_xn=this.f(this.xn);
		
	}
	@Override
	public	void correrConCriterioDeParo1() {
		this.preparar();
		this.registrarIteracion();
		this.calcularProximo();
		this.registrarIteracion();
		while (this.criterioDeParo1()) {
			this.calcularProximo();
			this.registrarIteracion();
			}
	}
	@Override
	public	void correrConCriterioDeParo2() {
		this.preparar();
		this.registrarIteracion();
		this.calcularProximo();
		this.registrarIteracion();
		while (this.criterioDeParo2()) {
			this.calcularProximo();
			this.registrarIteracion();
			}
	}
	@Override
	public 	void calcularProximo() {
		this.n++;
		this.xAnterior=this.xn;
		this.xn=this.xAnterior-(this.datos.f(xAnterior)/this.datos.f1(xAnterior));
		this.f_xn=this.f(this.xn);
	}
	public double f(double x) {
		return this.datos.f(x);
	}
	public double g(double x) { //g de ejemplo
		return this.datos.g(x);
	}


	public static void main(String[] args) throws InterruptedException{
		Principal p =new Principal();
		Datos datos=new Datos((double)2,(double)2.1,(double)1e-4) {
			@Override
			public double f(double x) {
				return (double)((Math.pow(x, 3)-2*x-5));
			}
			@Override
			public double f1(double x) {
				return (double)( Math.pow(x, 2)*3-2);
			} //derivada primera	
			@Override
			public double g(double x) {
				return 0 ;
			}
		};
		NewtonRaphson nR =new NewtonRaphson(datos, 2.1);
//		try {
//			biseccion.mostrarResultadoParaTest();
//		} catch (Exception e) {
//		}
		p.saludar(" biseccion comenzando");
		p.saludar(" biseccion terminado");
		p.saludar(" biseccion terminado");
		double x1 =datos.f1(1); 
		p.saludar(Double.toString(x1));
		nR.mostrarResultadoParaTest2();

		p.saludar("Hola");p.saludar("criterio1 ");

	
		}
	

}
