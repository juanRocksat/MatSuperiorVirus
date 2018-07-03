package algoritmos;

import java.util.ArrayList;
import java.util.Iterator;

import datos.Datos;
import datos.ListaDeDatos;
import main.Principal;
import registro_de_iteracion.Iteracion;

public class Biseccion_v2 extends Algoritmos{
	
	
	public Biseccion_v2(Datos _datos) {
		super(_datos);
	
	}
	

	@Override
	void preparar() {
		
	}

	@Override
	void calcularProximo() {
	}

	@Override
	ListaDeDatos getDatos() {
		ListaDeDatos lista_pf=new ListaDeDatos("Biseccion");
		return lista_pf;
	}
	

	

//	public void mostrarResultadoParaTest() {
////		this.correr();
//		if (lista_criterio1==null) {
//			(new Principal()).saludar("Lista nula ");
//		}
//		else {
//			int cant = this.getLista_criterio1().size();
//			for (int i = 1; i < cant+1; i++) {
//				Iteracion_criterio_1 registro = lista_criterio1.get(i);
//				System.out.println("("+registro.getN()+","+registro.getXn()+","+registro.getF_xn()+")");
//			}
//		}
//	}
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
