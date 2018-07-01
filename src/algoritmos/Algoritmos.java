package algoritmos;

import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import iteracion_registro.Iteracion;
import iteracion_registro.Iteracion_criterio_1;
import iteracion_registro.Iteracion_criterio_2;

public abstract class Algoritmos {
	public double n,x0,xn,puntoFijo,cotaInferior,cotaSuperior,xAnterior,cotaDeError;
	public double f_xn;
	public Iteracion iteracionCriterio1=null;
	public Iteracion iteracionCriterio2=null;
	public ArrayList<Iteracion_criterio_2> lista_criterio2 =null;
	public ArrayList<Iteracion_criterio_1> lista_criterio1 =null;
	public Datos datos=null;
	public Algoritmos(Datos datos) {
		setCotaInferior(datos.getCotaInferior());
		setCotaSuperior(datos.getCotaSuperior());
	}
	abstract void preparar();
	void iterar() {
		correrConCriterio1();
		correrConCriterio2();
	}
	public void correrConCriterio1() {
		for(this.preparar();this.criterioDeParo1();this.calcularProximo()) {			
		}
	}
	public void correrConCriterio2() {
		for(this.preparar();this.criterioDeParo2();this.calcularProximo()) {
		}
	}
	public  void registrar() {
		this.registrarCriterio1();
		this.registrarCriterio2();
	}
	public void registrarCriterio1() {
		this.getLista_criterio1().add(new Iteracion_criterio_1(this.n, this.getXn(), this.f_xn));
	}
	public void registrarCriterio2() {
		this.getLista_criterio2().add(new Iteracion_criterio_2(this.n, this.getXn(), this.f_xn));
	}
	abstract void calcularProximo() ;
	public boolean criterioDeParo1() {
		return  this.cotaDeError>this.datos.f(xn);
	}
	public boolean criterioDeParo2() {
		return this.cotaDeError>Math.abs(xAnterior-xn);
	}
	public boolean signosIguales(double a , double b) {
		float a_=(float)a;
		float b_=(float)b;
		return a_*b_>0;
	}
	abstract ListaDeDatos getDatos();
	
	
	//ACCESORS
	public double getX0() {
		return x0;
	}

	public void setX0(double x0) {
		this.x0 = x0;
	}

	public double getXn() {
		return xn;
	}

	public void setXn(double xn) {
		this.xn = xn;
	}

	public double getPuntoFijo() {
		return puntoFijo;
	}

	public void setPuntoFijo(double puntoFijo) {
		this.puntoFijo = puntoFijo;
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

	public Iteracion getIteracionCriterio1() {
		return iteracionCriterio1;
	}

	public void setIteracionCriterio1(Iteracion iteracionCriterio1) {
		this.iteracionCriterio1 = iteracionCriterio1;
	}

	public Iteracion getIteracionCriterio2() {
		return iteracionCriterio2;
	}

	public void setIteracionCriterio2(Iteracion iteracionCriterio2) {
		this.iteracionCriterio2 = iteracionCriterio2;
	}

	public ArrayList<Iteracion_criterio_2> getLista_criterio2() {
		return lista_criterio2;
	}

	public void setLista_criterio2(ArrayList<Iteracion_criterio_2> lista_criterio2) {
		this.lista_criterio2 = lista_criterio2;
	}

	public ArrayList<Iteracion_criterio_1> getLista_criterio1() {
		return lista_criterio1;
	}

	public void setLista_criterio1(ArrayList<Iteracion_criterio_1> lista_criterio1) {
		this.lista_criterio1 = lista_criterio1;
	}
	
	
	
	
	
}
