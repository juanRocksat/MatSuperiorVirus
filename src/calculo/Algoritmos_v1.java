package calculo;

public abstract class Algoritmos_v1 {
	public double memoria ;	
	public int n =0;
	public double x0,xn,ef,cotaInferior,cotaSuperior,xAnterior=x0; 
	public double cotaDeError=(double)1e-5;
	public double imagenActual=0   ;
	public double f(double x) {
		return (2*(Math.pow(2, x))+512*100*x+2048)/1024;
	}// en megabytes

//	public  abstract double aproximar(double cotaInferior, double cotaSuperior) ;
	public boolean criterioDeParo() {
		return cotaDeError>Math.abs(xAnterior-xn) && cotaDeError>f(xn);
	}
	public boolean criterioDeParo1() {
		return  cotaDeError>f(xn);
	}
	public double aproximar_criterio_1() {
		// TODO Auto-generated method stub
		 for(this.n=0;this.criterioDeParo1();this.seteos()); //en computacion el for y el this lo hacen mas rapido, visto desde el lenguage 	 
		return imagenActual;
	}
	public double aproximar_criterio_2(){

		 for(this.n=0;this.criterioDeParo2();this.seteos()); //en computacion el for y el this lo hacen mas rapido, visto desde el lenguage 	 
		return imagenActual;
	}
	public abstract  void seteos();

	public boolean criterioDeParo2() {
		return cotaDeError>Math.abs(xAnterior-xn);
	}
	
	public boolean signosIguales(double a , double b) {
		float a_=(float)a;
		float b_=(float)b;
		return a_*b_>0;
	}
	
	//GETTETS Y SETTERS
	public final double getMemoria() {
		return memoria;
	}
	public final void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public final int getN() {
		return n;
	}
	public final void setN(int n) {
		this.n = n;
	}
	public final double getX0() {
		return x0;
	}
	public final void setX0(double x0) {
		this.x0 = x0;
	}
	public final double getXn() {
		return xn;
	}
	public final void setXn(double xn) {
		this.xn = xn;
	}
	public final double getEf() {
		return ef;
	}
	public final void setEf(double ef) {
		this.ef = ef;
	}
	public final double getCotaInferior() {
		return cotaInferior;
	}
	public final void setCotaInferior(double cotaInferior) {
		this.cotaInferior = cotaInferior;
	}
	public final double getCotaSuperior() {
		return cotaSuperior;
	}
	public final void setCotaSuperior(double cotaSuperior) {
		this.cotaSuperior = cotaSuperior;
	}
	public final double getxAnterior() {
		return xAnterior;
	}
	public final void setxAnterior(double xAnterior) {
		this.xAnterior = xAnterior;
	}
	
	
}
