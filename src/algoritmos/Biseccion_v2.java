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
		this.datos=_datos;
	}

	@Override
	public void preparar() {
		this.n=1;
		this.cotaInferior=this.datos.getCotaInferior();
		this.cotaSuperior=this.datos.getCotaSuperior();
		this.cotaDeError=this.datos.getCotaDeError();
		this.xn=(double)(this.cotaInferior+this.cotaSuperior)/2;
		this.f_xn=this.datos.f(this.xn);
	}

	@Override
	public void calcularProximo() {
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
	public 	ListaDeDatos getDatos() {
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
			for (int i = 0; i < cant; i++) {
				System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
			}
		}
	}
	@Override
	public	void correrConCriterioDeParo1() {
		this.preparar();
		this.registrarIteracion();
		while (this.criterioDeParo1()) {
			calcularProximo();
			registrarIteracion();
			}
	}
	@Override
	public	void correrConCriterioDeParo2() {
		ArrayList<Iteracion> iteracionCriterio2=null;
		this.preparar();
		iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		while (this.criterioDeParo2()) {
			calcularProximo();
			iteracionCriterio2.add(new Iteracion(this.n, this.xn, this.f_xn));
		}
//		return iteracionCriterio2;
	}


	@Override
	public double getXn() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setXn(double xn) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getCotaInferior() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setCotaInferior(double cotaInferior) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getCotaSuperior() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setCotaSuperior(double cotaSuperior) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getxAnterior() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setxAnterior(double xAnterior) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getN() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setN(int n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getCotaDeError() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setCotaDeError(double cotaDeError) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getF_xn() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setF_xn(double f_xn) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setDatos(Datos datos) {
		// TODO Auto-generated method stub
		
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
