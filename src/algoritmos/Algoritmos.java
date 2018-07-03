package algoritmos;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;

public abstract class Algoritmos {
	int n=0;
	public double xn=0,cotaInferior=0,cotaSuperior=0,xAnterior=0,cotaDeError=0;
	public double f_xn=0;
	public Datos datos=null;
	public ArrayList<String> lista_de_xn=new ArrayList<String>(),lista_de_n=new ArrayList<String>(),lista_de_f_xn=new ArrayList<String>();
	
		
	abstract public void correrConCriterioDeParo1();
	abstract public void correrConCriterioDeParo2();
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

	
	
	
	
	
	
}
