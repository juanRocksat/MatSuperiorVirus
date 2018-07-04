package algoritmos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;
import registro_de_iteracion.Iteracion;

public class Biseccion extends Algoritmos{
	
	
	public Biseccion(Datos _datos) {
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
	

	
	
}