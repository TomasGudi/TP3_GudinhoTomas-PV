package ar.edu.unju.fi.ejercicio11;

public class Main {
	public static void main(String[] args) {
		
		for(int i = 2,k = 40,aux = 80;k > 0;i++,k--) {
			System.out.println(aux+" ");
			aux += (k-i-1);
		}
	}
}
