package algoritmos;

import java.util.ArrayList;

import datos.Datos;
import iteracion_registro.Iteracion;
import iteracion_registro.Iteracion_criterio_1;
import iteracion_registro.Iteracion_criterio_2;

public class Algoritmos {
	public double x0,xn,puntoFijo,cotaInferior,cotaSuperior,xAnterior,criterioDeParo; 
	public Iteracion iteracionCriterio1=null;
	public Iteracion iteracionCriterio2=null;
	public ArrayList<Iteracion_criterio_2> lista_criterio2 =null;
	public ArrayList<Iteracion_criterio_1> lista_criterio1 =null;
	
	public Algoritmos(Datos datos) {
		setCotaInferior(datos.getCotaInferior());
		setCotaSuperior(datos.getCotaSuperior());
	}
	
	
	
	
	
	
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

	public double getCriterioDeParo() {
		return criterioDeParo;
	}

	public void setCriterioDeParo(double criterioDeParo) {
		this.criterioDeParo = criterioDeParo;
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
