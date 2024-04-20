package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese un nombre: ");
       String nombre = scanner.nextLine();
       System.out.print("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
       String fechaStr = scanner.nextLine();

       String[] partesFecha = fechaStr.split("/");
       int dia = Integer.parseInt(partesFecha[0]);
       int mes = Integer.parseInt(partesFecha[1]) - 1;
       int anio = Integer.parseInt(partesFecha[2]);
       Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);

       Persona persona = new Persona(nombre, fechaNacimiento);

       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); // Mostrar fecha en formato dd/mm/yyyy
       System.out.println("Edad: " + persona.calcularEdad() + " años");
       System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
       System.out.println("Estación del año: " + persona.determinarEstacion());
       scanner.close();
   }
}

