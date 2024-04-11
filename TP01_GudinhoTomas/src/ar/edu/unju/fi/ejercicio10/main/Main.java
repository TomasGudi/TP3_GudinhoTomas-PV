package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diametro;
		boolean ingreEspeciales;
		
	    Scanner scanner = new Scanner(System.in);

	    for (int i = 1; i <= 3; i++) {
	    	
	        Pizza pizza = new Pizza();
	        diametro = 0;
	    	System.out.println("Ingrese datos de la pizza " + (i) + ":");
	        do {
		        System.out.print("Ingrese diametro 20, 30 o 40: ");
		        diametro = scanner.nextInt();
	        }while(diametro != 20 && diametro != 30 && diametro != 40);
	        pizza.setDiametro(diametro);
	        System.out.print("¿Tiene ingredientes especiales?: ");
	        ingreEspeciales = scanner.nextBoolean();
	        pizza.setIngreEspeciales(ingreEspeciales);
	        
	        pizza.calcularArea();
	        pizza.calcularPrecio();
	        
	        System.out.println("** Pizza " + (i) + " **");
	        System.out.println("Diametro: " + pizza.getDiametro());
	        System.out.println("Ingredientes especiales: " + pizza.getIngreEspeciales());
	        System.out.println("Precio Pizza: " + pizza.getPrecio() + "$");
	        System.out.println("Área: " + pizza.getArea());
	        System.out.println();
	    }
	    scanner.close();
	}

}
