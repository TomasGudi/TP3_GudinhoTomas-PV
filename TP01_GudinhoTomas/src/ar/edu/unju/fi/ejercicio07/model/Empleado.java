package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {	
       private String nombre;
	   private String legajo;
	   private double salario;
	   
	   public final double Minimo = 210000.00;
	   public final double Merito = 20000.00;
	   
	   public Empleado() {
	   }
	   public Empleado(String nombre, String legajo, double salario) {
	        this.nombre = nombre;
	        this.legajo = legajo;
	        salario=cambiarSalario(salario);
	        this.salario = salario;
	    }
	   public double cambiarSalario(double salario) {
	       if (salario < Minimo) {
	           salario = Minimo;
	       }
		return salario;
	   }
	   public static void mostrarDatos(Empleado empleado) {
	       System.out.println("Nombre: " + empleado.nombre);
	       System.out.println("Legajo: " + empleado.legajo);
	       System.out.println("Salario: $" + empleado.salario);
	   }
	   public void aumentoMerito() {
		    this.salario += Merito;
	   }
	   public String getNombre() {
	       return nombre;
	   }
	   public void setNombre(String Nombre) {
	       this.nombre = Nombre;
	   }
	   public String getLegajo() {
	       return legajo;
	   }
	   public void setLegajo(String legajo) {
	       this.legajo = legajo;
	   }
	   public double getSalario() {
	       return salario;
	   }
	   public void setSalario(double salario) {
	       this.salario = cambiarSalario(salario);
	   }
}
