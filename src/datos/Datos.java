package datos;

public abstract class Datos {
	double cotaSuperior,cotaInferior,cotaDeError;
	public Datos( double cotaInferior_,double cotaSuperior_, double cotaDeError_) {
		this.setCotaInferior(cotaInferior_);
		this.setCotaSuperior(cotaSuperior_);
		this.cotaDeError=cotaDeError_;
	}
	public double getCotaSuperior() {
		return cotaSuperior;
	}
	public void setCotaSuperior(double cotaSuperior) {
		this.cotaSuperior = cotaSuperior;
	}
	public double getCotaInferior() {
		return cotaInferior;
	}
	public void setCotaInferior(double cotaInferior) {
		this.cotaInferior = cotaInferior;
	}
	public double getCotaDeError() {
		return cotaDeError;
	}
	public void setCotaDeError(double cotaDeError) {
		this.cotaDeError = cotaDeError;
	};

	public abstract double f(double x) ;//{return 0;}
	public abstract double f1(double x);//{return 0;}//derivada primera
//	public abstract double f2(double x);//{return 0;}//derivada segunda
//	public abstract double f3(double x);//{return 0;}
//	public abstract double f4(double x);//{return 0;}
	public abstract double g(double x);
	
}
