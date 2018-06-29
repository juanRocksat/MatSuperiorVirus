package algoritmos;

public interface FuncionesMatematicas {
	public default boolean signosIguales(double a , double b) {
		float a_=(float)a;
		float b_=(float)b;
		return a_*b_>0;
	}
}
