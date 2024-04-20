package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       int n,suma = 0;

       Scanner scanner = new Scanner(System.in);
       
       do {
           System.out.print("Ingrese un rango [3-10]: ");
           n = scanner.nextInt();
       } while (n < 3 || n > 10);
       
       int[] array = new int[n];
       
       for (int i=0;i<n;i++) {
           System.out.print("Ingrese un número: ");
           array[i] = scanner.nextInt();
       }
       scanner.close();
       
       for (int i=0;i<n;i++) {
           suma += array[i];
       }
       System.out.println("La suma de todos los valores: "+suma);
   }
}

