package datos;

import java.util.ArrayList;

import iteracion_registro.Iteracion;
import iteracion_registro.Iteracion_criterio_1;
import iteracion_registro.Iteracion_criterio_2;

public class ListaDeDatos {
	String metodo=null;
	public ArrayList<Iteracion_criterio_1> listaDeCriterio1 =null;
	public ArrayList<Iteracion_criterio_2> listaDeCriterio2 =null;
	public ListaDeDatos(String metodo_) {
		this.metodo=metodo_;
	}
	
	
	
	//ACCESORS
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public ArrayList<Iteracion_criterio_1> getListaDeCriterio1() {
		return listaDeCriterio1;
	}
	public void setListaDeCriterio1(ArrayList<Iteracion_criterio_1> listaDeCriterio1) {
		this.listaDeCriterio1 = listaDeCriterio1;
	}
	public ArrayList<Iteracion_criterio_2> getListaDeCriterio2() {
		return listaDeCriterio2;
	}
	public void setListaDeCriterio2(ArrayList<Iteracion_criterio_2> listaDeCriterio2) {
		this.listaDeCriterio2 = listaDeCriterio2;
	}
	
	private void addLista(ArrayList<Iteracion_criterio_1> iteracion) {
		this.listaDeCriterio1.addAll(iteracion);
	}
	
//	private void addLista( ArrayList<Iteracion_criterio_2> iteracion2) {
//
//	}
}
