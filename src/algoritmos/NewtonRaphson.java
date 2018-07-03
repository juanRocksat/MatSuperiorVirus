package algoritmos;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import datos.Datos;
import datos.ListaDeDatos;
import registro_de_iteracion.Iteracion;

public class NewtonRaphson extends Algoritmos{
	
	double x0;
	public NewtonRaphson(Datos datos_ ,double x0_ ) {
		super(datos_);
		this.x0=x0_;
	}
	@Override
	void preparar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcularProximo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("PuntoFijo");
		return lista_pf;
	}
	@Override
	ArrayList<Iteracion> correrConCriterioDeParo1(ArrayList<Iteracion> iteracionCriterio1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	ArrayList<Iteracion> correrConCriterioDeParo2(ArrayList<Iteracion> iteracionCriterio2) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
