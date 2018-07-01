package algoritmos;

import datos.Datos;
import datos.ListaDeDatos;

public class Biseccion extends Algoritmos{

	public Biseccion(Datos datos) {
		super(datos);
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
		lista_pf.getListaDeCriterio1().addAll(this.getLista_criterio1());
		lista_pf.getListaDeCriterio2().addAll(this.getLista_criterio2());
		return lista_pf;
	}

	

	
	
}
