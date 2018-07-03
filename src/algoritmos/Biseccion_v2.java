package algoritmos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;
import registro_de_iteracion.Iteracion;

public class Biseccion_v2 extends Algoritmos{
	
	
	public Biseccion_v2(Datos _datos) {
		super(_datos);
	}
	

	@Override
	void preparar() {
		this.n=1;
		this.cotaInferior=this.datos.getCotaInferior();
		this.cotaSuperior=this.datos.getCotaSuperior();
		this.cotaDeError=this.datos.getCotaDeError();
		this.xn=(double)(this.cotaInferior+this.cotaSuperior)/2;
		this.f_xn=this.datos.f(this.xn);
	}

	@Override
	void calcularProximo() {
		this.xAnterior=this.xn;
		this.n++;
		if (signosIguales(this.f_xn, this.datos.f(cotaSuperior))) {
			this.cotaSuperior=this.xn;
		}
		else {
			this.cotaInferior=this.xn;
		}
		this.xn=(this.cotaInferior+this.cotaSuperior)/2;
		this.f_xn=this.datos.f(this.xn);
	}

	@Override
	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("Biseccion");
		return lista_pf;
	}
	public void mostrarResultadoParaTest() {
		this.correrConCriterioDeParo1();
		if (lista_de_n==null) {
			(new Principal()).saludar("Lista nula ");
		}
		else {
			int cant = lista_de_n.size();
			for (int i = 1; i < cant; i++) {
//				Iteracion registro = iteracionCriterio.get(i);
				System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
			}
		}
	}
//	@SuppressWarnings("null")
	@Override
	void correrConCriterioDeParo1() {
//		ArrayList<Iteracion> iteracionCriterio1 = null ;//suprime algun error de este null, es lista vacia por eso el null
		this.preparar();
		lista_de_n.add((int) this.n);
		lista_de_xn.add(this.xn);
		lista_de_f_xn.add(this.f_xn);
		while (this.criterioDeParo1()) {
			calcularProximo();
			lista_de_n.add((int) this.n);
			lista_de_xn.add(this.xn);
			lista_de_f_xn.add(this.f_xn);
		}
//		return iteracionCriterio1;
	}

	@SuppressWarnings("null")
	@Override
	void correrConCriterioDeParo2() {
		ArrayList<Iteracion> iteracionCriterio2=null;
		this.preparar();
		iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		while (this.criterioDeParo2()) {
			calcularProximo();
			iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		}
//		return iteracionCriterio2;
	}

//	public  void siEstaNuloAvisar(Object e) {
//		try {
//			if( e==null) {
//				System.out.println("Esta nulo");
//			}
//		} catch (Exception e2) {
//			// TODO: handle exception
//			System.out.println("Esta nulo");
//		}
//	}
	
	
}
