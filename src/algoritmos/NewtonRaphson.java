package algoritmos;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
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
	
	
	

}
