package calculo;

public class Biseccion extends Algoritmos{
	
	double imagenActual = 0;
	double imagenCotaInferior,imagenCotaSuperior;
	public Biseccion() {
		x0=(cotaSuperior+cotaInferior)/2;
		xn=x0;
	}
	
	public Biseccion(double cotaInferior_, double cotaSuperior_) {
		setCotaInferior(cotaInferior_);
		setCotaSuperior(cotaSuperior_);
		x0=(cotaSuperior_+cotaInferior_)/2;
		xn=x0;
	}
	private void seteos() {
		imagenActual=this.f(xn);
		imagenCotaInferior=f(cotaInferior);
		imagenCotaSuperior=f(cotaSuperior);
		n++;
		if(signosIguales(imagenCotaInferior, imagenActual)) {
			cotaInferior=xn;
		}
		else {
			cotaSuperior=xn;
		}
	}
	@Override
	public double aproximar() {
		// TODO Auto-generated method stub
		 for(this.n=0;this.criterioDeParo();this.seteos()); //en computacion el for y el this lo hacen mas rapido, visto desde el lenguage C
		 return imagenActual;
	}

}
