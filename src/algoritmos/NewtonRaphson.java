package algoritmos;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;
import registro_de_iteracion.Iteracion;

public class NewtonRaphson extends Algoritmos{
	public double x0;
	public NewtonRaphson(Datos datos_ ,double x0_ ) {
		this.datos=datos_;
		this.x0=x0_;
	}
	@Override
	public	void preparar() {
		this.n=1;
		this.xAnterior=this.x0;
		this.xn=this.x0;
		this.f_xn=this.datos.f(this.xn);
		
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
		while (this.criterioDeParo2()) {
			calcularProximo();
			registrarIteracion();
			}
	}
	public double f(double x) {
		return this.datos.f(x);
	}
	public double g(double x) { //g de ejemplo
		return this.datos.g(x);
	}

	@Override
	public 	void calcularProximo() {
		this.n++;
		this.xAnterior=this.xn;
		this.xn=this.xAnterior-(this.datos.f(xAnterior)/this.datos.f1(xAnterior));
		this.f_xn=this.datos.f(this.xn);
	}

	@Override
	public 	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("PuntoFijo");
		return lista_pf;
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
		NewtonRaphson nR =new NewtonRaphson(datos, 1);
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
		p.saludar("Hola");p.saludar("Hola");
			
		}
	

}
