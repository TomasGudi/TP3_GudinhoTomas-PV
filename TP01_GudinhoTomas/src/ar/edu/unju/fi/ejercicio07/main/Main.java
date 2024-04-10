package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("\nIngrese datos del empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Legajo: ");
        String legajo = scanner.next();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        
        scanner.close();
        
        Empleado empleado = new Empleado(nombre, legajo, salario);
    	Empleado.mostrarDatos(empleado);
    
    	empleado.aumentoMerito();
    	Empleado.mostrarDatos(empleado);	
	}
}
