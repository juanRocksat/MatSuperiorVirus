package iteracion_registro;

public abstract class Iteracion {
	double n,xn,f_xn;
	public Iteracion(double n_, double xn_,double f_xn_) {	
		this.xn=xn_;
		this.n=n_;
		this.f_xn=f_xn_;
	}
}
