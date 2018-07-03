package algoritmos;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import registro_de_iteracion.Iteracion;

public class NewtonRaphson extends Algoritmos{
	
	double x0;
	public NewtonRaphson(Datos datos_ ,double x0_ ) {
		this.datos=datos_;
		this.x0=x0_;
	}
	@Override
	public	void preparar() {
		this.n=1;
		this.xAnterior=this.x0; 
		this.xn=this.x0+1;//para que no pare en la primera iteracion 
		
	}

	@Override
	public 	void calcularProximo() {
		this.xAnterior=this.xn;
		this.xn=xAnterior-(datos.f(xAnterior)/datos.f1(xAnterior));
	}

	@Override
	public 	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("PuntoFijo");
		return lista_pf;
	}
	
	@SuppressWarnings("null")
	@Override
	public 	void correrConCriterioDeParo1() {
		ArrayList<Iteracion> iteracionCriterio1=null;//suprime algun error de este null, es lista vacia por eso el null
		this.preparar();
		iteracionCriterio1.add(new Iteracion(this.n, this.xn, this.f_xn));
		while (this.criterioDeParo1()) {
			calcularProximo();
			iteracionCriterio1.add(new Iteracion(this.n, this.xn, this.f_xn));
		}
//		return iteracionCriterio1;
	}
	@SuppressWarnings("null")
	@Override
	public 	void correrConCriterioDeParo2() {
		ArrayList<Iteracion> iteracionCriterio2=null;
		this.preparar();
		iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		while (this.criterioDeParo2()) {
			calcularProximo();
			iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		}
//		return iteracionCriterio2;
	}


	
	

}
