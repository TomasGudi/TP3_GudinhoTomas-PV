package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
		private int n;
		
		public double aux;
		
		public CalculadoraEspecial() {
		}
		public void calcularSumatoria(int n) {
			aux = 0.0;
			for(double k = 1.0 ; k <= n ; k++) {
				aux = aux + Math.pow((k*(k+1))/2, 2);
			}
		System.out.println(aux);
		}
		public void calcularProductoria(int n) {
			aux = 1.0;
			for(double k = 1.0 ; k <= n ; k++) {
				aux = aux * (k*(k+4));
			}
		System.out.println(aux);
		}
		
		public double getn() {
		       return n;
		}
		public void setn(int n) {
		       this.n = n;
		}
}
