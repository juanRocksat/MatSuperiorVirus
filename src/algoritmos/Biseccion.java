package algoritmos;

import java.awt.List;
import java.util.Iterator;

import datos.Datos;
import datos.ListaDeDatos;
import registro_de_iteracion.Iteracion_criterio_1;

public class Biseccion extends Algoritmos{

	public Biseccion(Datos datos) {
		super(datos);
	}

	@Override
	void preparar() {
		this.n=1;
		this.x0=(this.getCotaInferior()+this.getCotaSuperior())/2;
		this.xn=this.x0;
		this.f_xn=this.datos.f(this.xn);
		if(this.signosIguales(this.f_xn, this.getCotaInferior())) {
			this.setCotaInferior(this.xn);
		}
		else {
			this.setCotaSuperior(this.xn);
		}
		this.xAnterior=this.xn;
		this.xn=(this.getCotaInferior()+this.getCotaSuperior())/2;
		this.f_xn=this.datos.f(this.xn);
	}

	@Override
	void calcularProximo() {
		if(this.signosIguales(this.f_xn, this.getCotaInferior())) {
			this.setCotaInferior(this.xn);
		}
		else {
			this.setCotaSuperior(this.xn);
		}	
		this.xAnterior=this.xn;
		this.xn=(this.getCotaInferior()+this.getCotaSuperior())/2;
		this.f_xn=this.datos.f(this.xn);
		this.n++;
	}

	@Override
	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("PuntoFijo");
		lista_pf.getListaDeCriterio1().addAll(this.getLista_criterio1());
		lista_pf.getListaDeCriterio2().addAll(this.getLista_criterio2());
		return lista_pf;
	}
	@Override
	void iterar() {
		correrConCriterio1();
		correrConCriterio2();
	}

	@Override
	void correrConCriterio1() {
		for (this.preparar(); this.criterioDeParo1() ; this.calcularProximo()) {
			this.registrarCriterio1();
		}
	}

	@Override
	void correrConCriterio2() {
		for (this.preparar(); this.criterioDeParo2() ; this.calcularProximo()) {
			this.registrarCriterio2();
		}
	}

	public void motrarResultadoParaTest() {
		for (int i = 0; i < lista_criterio1.size(); i++) {
			Iteracion_criterio_1 registro = lista_criterio1.get(i);
			System.out.println(registro);
		}
	}

	
	
}
