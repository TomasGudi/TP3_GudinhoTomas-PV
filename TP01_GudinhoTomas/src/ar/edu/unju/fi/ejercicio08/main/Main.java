package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio08.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraEspecial calculo = new CalculadoraEspecial();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nIngrese n de la Sumatoria:");
        int n = scanner.nextInt();
        calculo.setn(n);
        calculo.calcularSumatoria(n);
	
        System.out.println("\nIngrese n de la Productoria:");
        n = scanner.nextInt();
        calculo.setn(n);
        calculo.calcularProductoria(n);
        
		scanner.close();
	}

}
