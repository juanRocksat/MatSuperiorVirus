package calculo;

public abstract class Algoritmos {
	public double memoria ;	
	public int n =0;
	public double x0,xn,ef,cotaInferior,cotaSuperior,xAnterior=x0; 
	
	public double f(double x) {
		return (2*(Math.pow(2, x))+512*100*x+2048)/1024;
	}// en megabytes
	public abstract double aproximar();
	public  abstract double aproximar(double cotaInferior, double cotaSuperior) ;
	public boolean criterioDeParo(double errorMaximo) {
		return errorMaximo>Math.abs(xAnterior-xn) && errorMaximo>f(xn);
	}
	public boolean criterioDeParo_xn(double errorMaximo) {
		return  errorMaximo>f(xn);
	}
	public boolean criterioDeParo_xn_xAnt(double errorMaximo) {
		return errorMaximo>Math.abs(xAnterior-xn);
	}
	public boolean imagenesIguales(double a , double b) {
		int a_=(int)a;
		int b_=(int)b;
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
