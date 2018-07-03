package registro_de_iteracion;

public  class Iteracion {
	double n,xn,f_xn;
	public Iteracion(double n_, double xn_,double f_xn_) {	
		this.xn=xn_;
		this.n=n_;
		this.f_xn=f_xn_;
	}
	
	//ACCESORS
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getXn() {
		return xn;
	}
	public void setXn(double xn) {
		this.xn = xn;
	}
	public double getF_xn() {
		return f_xn;
	}
	public void setF_xn(double f_xn) {
		this.f_xn = f_xn;
	}
	
}
