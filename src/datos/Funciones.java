package datos;

public abstract class Funciones implements Funciones_f{
	double cotaSuperior,cotaInferior,cotaDeError;
//	public Funciones(double cotaInferior_,double cotaSuperior_,double cotaDeError_) {
//		this.setCotaInferior(cotaInferior_);
//		this.setCotaSuperior(cotaSuperior_);
//		this.cotaDeError=cotaDeError_;
//	}
	
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
	
	
}
