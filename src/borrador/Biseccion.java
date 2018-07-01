package borrador;

import datos.Datos;

public class Biseccion extends Algoritmos_v1{
	
//	double imagenActual = 0;
	double imagenCotaInferior,imagenCotaSuperior;
	public Biseccion(Datos datos) {
		x0=(cotaSuperior+cotaInferior)/2;
		xn=x0;
	}
	
	public Biseccion(double cotaInferior_, double cotaSuperior_) {
		setCotaInferior(cotaInferior_);
		setCotaSuperior(cotaSuperior_);
		x0=(cotaSuperior_+cotaInferior_)/2;
		xn=x0;
	}
	public void seteos() {
		imagenActual=this.f(xn);
		imagenCotaInferior=this.f(cotaInferior);
		imagenCotaSuperior=this.f(cotaSuperior);
		n++;
		if(signosIguales(imagenCotaInferior, this.imagenActual)) {
			cotaInferior=xn;
		}
		else {
			cotaSuperior=xn;
		}
	}
	
}
