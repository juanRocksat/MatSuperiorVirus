package algoritmos;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;

public abstract class Algoritmos {
	int n=0;
	public double xn=0,cotaInferior=0,cotaSuperior=0,xAnterior=0,cotaDeError=0;
	public double f_xn=0;
	public Datos datos=null;
	public ArrayList<String> lista_de_xn=new ArrayList<String>(),lista_de_n=new ArrayList<String>(),lista_de_f_xn=new ArrayList<String>();
	
		
	public	void correrConCriterioDeParo1() {
		this.preparar();
		this.registrarIteracion();
		while (this.criterioDeParo1()) {
			this.calcularProximo();
			this.registrarIteracion();
			}
	}
	public	void correrConCriterioDeParo1_v2() {  //igual a la anterior	
		for ( this.preparar();this.criterioDeParo1();this.calcularProximo()) {
			this.registrarIteracion();
		}
		this.registrarIteracion();
	}
	public	void correrConCriterioDeParo2() {
		this.preparar();
		this.registrarIteracion();
		while (this.criterioDeParo2()) {
			calcularProximo();
			registrarIteracion();
			}
	}
	public void preparar() {
	};
	
	abstract public void calcularProximo();
	
	public  boolean criterioDeParo1() {
		return !(this.cotaDeError>Math.abs(this.xAnterior-this.xn));// && this.getxAnterior()==(Double)null;
	}
	public  boolean criterioDeParo2() {
		return  !(this.cotaDeError>Math.abs(this.f_xn));
	}
	public  boolean signosIguales(double a , double b) {
		float a_=(float)a;
		float b_=(float)b;
		return a_*b_>0;
	}
	public ListaDeDatos getDatos() {
		return null;
		
	};
	public  void registrarIteracion() {
		lista_de_n.add( Integer.toString( this.n));
		lista_de_xn.add(Double.toString( this.xn));
		lista_de_f_xn.add(Double.toString( this.f_xn));
	}
	public void mostrarResultadoParaTest1() {
		this.correrConCriterioDeParo1();
//		if (lista_de_n==null) {
//			(new Principal()).saludar("Lista nula ");
//		}
//		else {
//			int cant = lista_de_n.size();
//			for (int i = 0; i < cant; i++) {
//				System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
//			}
//		}
		int cant = lista_de_n.size();
		for (int i = 0; i < cant; i++) {
			System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
		}
	}
	public void mostrarResultadoParaTest2() {
		this.correrConCriterioDeParo2();
		int cant = lista_de_n.size();
		for (int i = 0; i < cant; i++) {
			System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
			}
		}
	
	
	
	//ACCESORS
	

	public double getXn() {
		return xn;
	}

	public void setXn(double xn) {
		this.xn = xn;
	}

	

	public double getCotaInferior() {
		return cotaInferior;
	}

	public void setCotaInferior(double cotaInferior) {
		this.cotaInferior = cotaInferior;
	}

	public double getCotaSuperior() {
		return cotaSuperior;
	}

	public void setCotaSuperior(double cotaSuperior) {
		this.cotaSuperior = cotaSuperior;
	}

	public double getxAnterior() {
		return xAnterior;
	}

	public void setxAnterior(double xAnterior) {
		this.xAnterior = xAnterior;
	}
	public double getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getCotaDeError() {
		return cotaDeError;
	}
	public void setCotaDeError(double cotaDeError) {
		this.cotaDeError = cotaDeError;
	}
	public double getF_xn() {
		return f_xn;
	}
	public void setF_xn(double f_xn) {
		this.f_xn = f_xn;
	}
	public void setDatos(Datos datos) {
		this.datos = datos;
	}
	public ArrayList<String> getLista_de_xn() {
		return lista_de_xn;
	}
	public void setLista_de_xn(ArrayList<String> lista_de_xn) {
		this.lista_de_xn = lista_de_xn;
	}
	public ArrayList<String> getLista_de_n() {
		return lista_de_n;
	}
	public void setLista_de_n(ArrayList<String> lista_de_n) {
		this.lista_de_n = lista_de_n;
	}
	public ArrayList<String> getLista_de_f_xn() {
		return lista_de_f_xn;
	}
	public void setLista_de_f_xn(ArrayList<String> lista_de_f_xn) {
		this.lista_de_f_xn = lista_de_f_xn;
	}

	
	
	
	
	
	
}
