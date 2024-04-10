package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    public Persona() {
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }
    
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public static int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        return calcularEdad(fechaNacimiento) >= 18;
    }

    public static void mostrarDatos(Persona persona) {
        System.out.println("DNI: " + persona.dni);
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Fecha de nacimiento: " + persona.fechaNacimiento);
        System.out.println("Provincia: " + persona.provincia);
        System.out.println("Edad: " + calcularEdad(persona.fechaNacimiento));
        
        if (esMayorDeEdad(persona.fechaNacimiento)) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}

