package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       String[] array = new String[5];

       byte indice;
       boolean flag=true;
       Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < array.length; i++) {
           System.out.print("Ingrese un nombre: ");
           array[i] = scanner.nextLine();
       }

       System.out.println();
       int aux = 0;
       while (aux<array.length) {
           System.out.println("Posición "+aux+": "+array[aux]);
           aux++;
       }
       System.out.println("\nTamaño: "+array.length);
       do {
           System.out.print("\nIngrese un indice [0-4] para eliminar o otro numero para terminar: ");
           indice = scanner.nextByte();
           if (indice<0 || indice>array.length) {
               flag=false;
           } 
           else {
        	   for (int i=indice;i<array.length-1;i++) {
                   array[i] = array[i+1];
               }
               array[array.length - 1] = "";
           }
       } while(flag);
       
       System.out.println();
       for (String nombre : array) {
           System.out.println("Elemento: " + nombre);
       }
       scanner.close();
   }
}