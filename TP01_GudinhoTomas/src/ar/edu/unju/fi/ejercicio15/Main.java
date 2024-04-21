package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int n;
       
       do {
           System.out.print("Ingrese un rango [5-10]: ");
           n = scanner.nextInt();
       } while (n < 5 || n > 10);
       
       String[] array = new String[n];
       
       array[0] = scanner.nextLine();
       for (int i=0;i<n;i++) {
           System.out.print("Ingrese un nombre: ");
           array[i] = scanner.nextLine();
       }
       scanner.close();
       
       for (int i=0;i<n;i++) {
           System.out.println("En la posicion ["+i+"]: "+array[i]);
       }
       for (int i=n-1;i>=0;i--) {
           System.out.println("En la posicion ["+i+"]: "+array[i]);
       }
   }
}