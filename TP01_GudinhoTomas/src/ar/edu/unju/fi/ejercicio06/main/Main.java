package ar.edu.unju.fi.ejercicio06.main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        Persona persona1 = new Persona();
        //Persona.mostrarDatos(persona1);

        System.out.println("\nIngrese datos para persona con constructor parametrizado:");
        System.out.print("DNI: ");
        String dni = scanner.next();
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
        String fechaNacimientoStr = scanner.next();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        System.out.print("Provincia: ");
        String provincia = scanner.next();

        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        Persona.mostrarDatos(persona2);

        System.out.println("\nIngrese datos para persona con constructor simplificado:");
        System.out.print("DNI: ");
        dni = scanner.next();
        System.out.print("Nombre: ");
        nombre = scanner.next();
        System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
        fechaNacimientoStr = scanner.next();
        fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        Persona.mostrarDatos(persona3);

        scanner.close();
    }
}


