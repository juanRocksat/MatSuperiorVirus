package algoritmos;

import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import registro_de_iteracion.Iteracion;

public abstract class Algoritmos {
	public double n,xn,cotaInferior,cotaSuperior,xAnterior,cotaDeError;
	public double f_xn;
	public Datos datos=null;
	public Algoritmos(Datos _datos) {
		this.datos=_datos;
	}
//	abstract void correr();
	abstract ArrayList<Iteracion> correrConCriterioDeParo1(ArrayList<Iteracion> iteracionCriterio1);
	abstract ArrayList<Iteracion> correrConCriterioDeParo2(ArrayList<Iteracion> iteracionCriterio2);
	abstract void preparar();
	
	abstract void calcularProximo() ;
	
	public boolean criterioDeParo1() {
		return !(this.cotaDeError>Math.abs(this.xAnterior-this.xn));// && this.getxAnterior()==(Double)null;
//		return  this.cotaDeError>this.datos.f(xn);
	}
	public boolean criterioDeParo2() {
		return  !(this.cotaDeError>Math.abs(this.f_xn));
	}
	public boolean signosIguales(double a , double b) {
		float a_=(float)a;
		float b_=(float)b;
		return a_*b_>0;
	}
	abstract ListaDeDatos getDatos();
	
	
	
	
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
	public void setN(double n) {
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
