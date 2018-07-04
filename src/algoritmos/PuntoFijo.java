package algoritmos;

import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;
import registro_de_iteracion.Iteracion;

public class PuntoFijo extends Algoritmo{
	public double x0;

	public PuntoFijo(Datos datos_, double x0_) {
		this.datos=datos_;
		this.x0=x0_;
		this.cotaDeError=this.datos.getCotaDeError();
	}

	@Override
	public 	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("PuntoFijo");
		return lista_pf;
	}

	@Override
	public	void correrConCriterioDeParo1() {
		this.n=1;
		this.xn=this.x0;
		this.f_xn=this.f(this.xn);
		this.registrarIteracion();
		this.n++;
		this.xAnterior=this.xn;
		this.xn=this.g(this.xn);
		this.f_xn=this.f(this.xn);
		this.registrarIteracion();
		while (this.criterioDeParo1()) {
			this.n++;
			this.xAnterior=this.xn;
			this.xn=this.g(this.xn);
			this.f_xn=this.f(this.xn);
			this.registrarIteracion();
		}
		
	}
	public  void mostrardatosCalculados() {
		int cant = lista_de_n.size();
		for (int i = 0; i < cant; i++) {
			System.out.println("("+lista_de_n.get(i)+","+lista_de_xn.get(i)+","+lista_de_f_xn.get(i)+")");		
		}
	}
	public double f(double x) {
		return this.datos.f(x);
	}
	public double g(double x) { //g de ejemplo
		return this.datos.g(x);
	}


	@Override
	public	void correrConCriterioDeParo2() {	
		this.n=1;
		this.xn=this.x0;
		this.f_xn=this.f(this.xn);
		this.registrarIteracion();
		this.n++;
		this.xAnterior=this.xn;
		this.xn=this.g(this.xn);
		this.f_xn=this.f(this.xn);
		this.registrarIteracion();
		while (this.criterioDeParo2()) {
			this.n++;
			this.xAnterior=this.xn;
			this.xn=this.g(this.xn);
			this.f_xn=this.f(this.xn);
			this.registrarIteracion();
		}
	}
	@Override
	public void calcularProximo() {	
	}

	public static void main(String[] args) throws InterruptedException{
		Datos datos = new Datos((double)1,(double)2,(double)1e-2) {
			@Override
			public double f(double x) {
				return (double)((Math.pow(Math.E, x/2)+(x*x)-(2*x)-3));
			}
			@Override
			public double f1(double x) {//derivada primera
				return (double)( Math.pow(Math.E, x)+1);
			} 	
			@Override
			public double g(double x) { //g de ejemplo
				return Math.sqrt(2*x+3-Math.pow(Math.E, x/2));
			}
		};
		PuntoFijo pFijo=new PuntoFijo(datos, 3);
		System.out.println(pFijo.g(3));
		System.out.println("probando");
//		pFijo.n=1;
//		pFijo.xn=pFijo.x0;
//		pFijo.f_xn=pFijo.f(pFijo.xn);
//		pFijo.registrarIteracion();
//		pFijo.n++;
//		pFijo.xAnterior=pFijo.xn;
//		pFijo.xn=pFijo.g(pFijo.xn);
//		pFijo.f_xn=pFijo.f(pFijo.xn);
//		pFijo.registrarIteracion();
//		while (pFijo.criterioDeParo1()) {
//			pFijo.n++;
//			pFijo.xAnterior=pFijo.xn;
//			pFijo.xn=pFijo.g(pFijo.xn);
//			pFijo.f_xn=pFijo.f(pFijo.xn);
//			pFijo.registrarIteracion();
//		}
		pFijo.correrConCriterioDeParo2();
		
		pFijo.mostrardatosCalculados();
		
	}

	


	
}
