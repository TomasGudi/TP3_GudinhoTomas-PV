package ar.edu.unju.fi.ejercicio12.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.time.ZoneId;

public class Persona {
   private String nombre;
   private Calendar fechaNacimiento;
   
   public Persona(String nombre, Calendar fechaNacimiento) {
       this.nombre = nombre;
       this.fechaNacimiento = fechaNacimiento;
   }
   
   public int calcularEdad() {
	   LocalDate fechaNacimientoLD = fechaNacimiento.toInstant()
               .atZone(ZoneId.systemDefault())
               .toLocalDate();
	   return Period.between(fechaNacimientoLD, LocalDate.now()).getYears();
   }

   public String determinarSignoZodiaco() {
       int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
       int mes = fechaNacimiento.get(Calendar.MONTH);
       
       if ((mes == Calendar.MARCH && dia >= 21) || (mes == Calendar.APRIL && dia <= 19)) {
           return "Aries";
       } else if ((mes == Calendar.APRIL && dia >= 20) || (mes == Calendar.MAY && dia <= 20)) {
           return "Tauro";
       } else if ((mes == Calendar.MAY && dia >= 21) || (mes == Calendar.JUNE && dia <= 20)) {
           return "Géminis";
       } else if ((mes == Calendar.JUNE && dia >= 21) || (mes == Calendar.JULY && dia <= 22)) {
           return "Cáncer";
       } else if ((mes == Calendar.JULY && dia >= 23) || (mes == Calendar.AUGUST && dia <= 22)) {
           return "Leo";
       } else if ((mes == Calendar.AUGUST && dia >= 23) || (mes == Calendar.SEPTEMBER && dia <= 22)) {
           return "Virgo";
       } else if ((mes == Calendar.SEPTEMBER && dia >= 23) || (mes == Calendar.OCTOBER && dia <= 22)) {
           return "Libra";
       } else if ((mes == Calendar.OCTOBER && dia >= 23) || (mes == Calendar.NOVEMBER && dia <= 21)) {
           return "Escorpio";
       } else if ((mes == Calendar.NOVEMBER && dia >= 22) || (mes == Calendar.DECEMBER && dia <= 21)) {
           return "Sagitario";
       } else if ((mes == Calendar.DECEMBER && dia >= 22) || (mes == Calendar.JANUARY && dia <= 19)) {
           return "Capricornio";
       } else if ((mes == Calendar.JANUARY && dia >= 20) || (mes == Calendar.FEBRUARY && dia <= 18)) {
           return "Acuario";
       } else {
           return "Piscis";
       }
   }
   public String determinarEstacion() {
       int mes = fechaNacimiento.get(Calendar.MONTH);
       int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
       
       switch (mes) {
           case Calendar.JANUARY:
        	   return "Verano";
           case Calendar.FEBRUARY:
        	   return "Verano";   
           case Calendar.MARCH:
        	   if (dia >= 21) {
                   return "Otoño";
            	   }
            	   else {
            		   return "Verano";
            	   } 
           case Calendar.APRIL:
               return "Otoño";
           case Calendar.MAY:
               return "Otoño";
           case Calendar.JUNE:
        	   if (dia >= 21) {
                   return "Invierno";
            	   }
            	   else {
            		   return "Otoño";
            	   } 
           case Calendar.JULY:
        	   return "Invierno";
           case Calendar.AUGUST:
               return "Invierno";
           case Calendar.SEPTEMBER:
        	   if (dia >= 21) {
                   return "Primavera";
            	   }
            	   else {
            		   return "Invierno";
            	   } 
           case Calendar.OCTOBER:
               return "Primavera";
           case Calendar.NOVEMBER:
               return "Primavera";
           case Calendar.DECEMBER:
        	   if (dia >= 21) {
               return "Verano";
        	   }
        	   else {
        		   return "Primavera";
        	   } 
           default:
               return "Error";
       }
   }
   public String getNombre() {
       return nombre;
   }
   public Calendar getFechaNacimiento() {
       return fechaNacimiento;
   }
}

